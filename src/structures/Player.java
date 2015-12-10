package structures;

import statistics.*;
import java.util.ArrayList;

public class Player
{
	private String myName;
	private Position naturalPosition;
	private ArrayList<PlayerSeasonStats> seasonsStats;
	
	public static enum Position 
	{
		POINT_GUARD    ("Point guard",    "PG"),
		SHOOTING_GUARD ("Shooting guard", "SG"),
		SMALL_FORWARD  ("Small forward",  "SF"),
		POWER_FORWARD  ("Power forward",  "PF"),
		CENTER         ("Center",         "C" );
		
		private final String longName;
		private final String shortName;
		
		Position (String name, String abrev)
		{
			this.longName  = name;
			this.shortName = abrev;
		}
	}
	
	public Player(String name, Position pos)
	{
		seasonsStats = new ArrayList<PlayerSeasonStats>();
		myName = name;
		naturalPosition = pos;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public Position getNaturalPosition()
	{
		return naturalPosition;
	}
	
	public void addPlayerGameStatsToPlayerSeasonStats(Game game, String seasonName)
	{
		PlayerGameStats newGameStats = new PlayerGameStats(game.getGameName());
		
		for (AbstractGameStatistic a : game.getGamePlays())
		{
			if (a.getPlayerName().equalsIgnoreCase(getName()))
			{
				switch (a.getType())
				{
					case FIELD_GOAL:
						
						if (a.getSuccess())
						{
							newGameStats.recordMadeFieldGoal();
						}
						else
						{
							newGameStats.recordMissedFieldGoal();
						}
						
						break;
					case THREE_PT_FIELD_GOAL:

						if (a.getSuccess())
						{
							newGameStats.recordMadeThreePointFieldGoal();
						}
						else
						{
							newGameStats.recordMissedThreePointFieldGoal();
						}
						
						break;
					case FREE_THROW:
						
						if (a.getSuccess())
						{
							newGameStats.recordMadeFreeThrow();
						}
						else
						{
							newGameStats.recordMissedFreeThrow();
						}
						
						break;
					case OFFENSIVE_REBOUND:
						newGameStats.addOffensiveRebound();
						break;
					case DEFENSIVE_REBOUND:
						newGameStats.addDefensiveRebound();
						break;
					case ASSIST:
						newGameStats.addAssist();
						break;
					case BLOCK:
						newGameStats.addBlock();
						break;
					case STEAL:
						newGameStats.addSteal();
						break;
					case TURNOVER:
						newGameStats.addTurnover();
						break;
					default:
						// Throw exception
						break;
				}
			}
		}
		
		newGameStats.calculateShootingPercentages();
		
		boolean seasonExists = false;
		
		for (PlayerSeasonStats p : seasonsStats)
		{
			if (p.getSeasonName().equalsIgnoreCase(seasonName))
			{
				seasonExists = true;
				p.addPlayerGameStats(newGameStats);
			}
			
			if (!seasonExists)
			{
				PlayerSeasonStats newSeasonStats = new PlayerSeasonStats(seasonName, newGameStats);
				seasonsStats.add(newSeasonStats);
			}
		}
	}
}
