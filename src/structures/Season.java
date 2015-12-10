package structures;

import java.io.Serializable;
import java.util.ArrayList;

public class Season implements Serializable
{
	private static final long serialVersionUID = 2L;
	private ArrayList<Game> games;
	private ArrayList<Player> players;
	private String seasonName;
	private String teamName;
	private float fieldGoalPercentage;
	private float freeThrowPercentage;
	private float threePointPercentage;
	private short totalFieldGoalAttempts;
	private short totalFieldGoalsMade;
	private short totalThreePointFieldGoalAttempts;
	private short totalThreePointFieldGoalsMade;
	private short totalFreeThrowAttempts;
	private short totalFreeThrowsMade;
	private short totalRebounds;
	private short totalDefensiveRebounds;
	private short totalOffensiveRebounds;
	private short totalAssists;
	private short totalSteals;
	private short totalBlocks;
	private short totalTurnovers;
	
	public Season()
	{
		games = new ArrayList<Game>();
		players = new ArrayList<Player>();
		seasonName = null;
		teamName = "Afro Penguins";
	}
	
	public Season(ArrayList<Game> games, ArrayList<Player> players, String seasonName)
	{
		this.games = games;
		this.players = players;
		this.seasonName = seasonName;
		teamName = "Afro Penguins";
	}
	
	public void addGame(Game newGame)
	{
		games.add(newGame);
	}
	
	public void setSeasonName(String seasonName)
	{
		this.seasonName = seasonName;
	}
	
	public void addPlayer(Player newPlayer)
	{
		players.add(newPlayer);
	}
	
	public String getSeasonName()
	{
		return this.seasonName;
	}
	
	public String getTeamName()
	{
		return this.teamName;
	}

	public ArrayList<Game> getGames() 
	{
		return games;
	}

	public ArrayList<Player> getPlayers() 
	{
		return players;
	}

	public float getFieldGoalPercentage() 
	{
		return fieldGoalPercentage;
	}

	public float getFreeThrowPercentage() 
	{
		return freeThrowPercentage;
	}

	public float getThreePointPercentage() 
	{
		return threePointPercentage;
	}

	public short getTotalFieldGoalAttempts() 
	{
		return totalFieldGoalAttempts;
	}

	public short getTotalFieldGoalsMade() 
	{
		return totalFieldGoalsMade;
	}

	public short getTotalThreePointFieldGoalAttempts() 
	{
		return totalThreePointFieldGoalAttempts;
	}

	public short getTotalThreePointFieldGoalsMade() 
	{
		return totalThreePointFieldGoalsMade;
	}

	public short getTotalFreeThrowAttempts() 
	{
		return totalFreeThrowAttempts;
	}

	public short getTotalFreeThrowsMade() 
	{
		return totalFreeThrowsMade;
	}

	public short getTotalRebounds() 
	{
		return totalRebounds;
	}

	public short getTotalDefensiveRebounds() 
	{
		return totalDefensiveRebounds;
	}

	public short getTotalOffensiveRebounds() 
	{
		return totalOffensiveRebounds;
	}

	public short getTotalAssists() 
	{
		return totalAssists;
	}

	public short getTotalSteals() 
	{
		return totalSteals;
	}

	public short getTotalBlocks() 
	{
		return totalBlocks;
	}

	public short getTotalTurnovers() 
	{
		return totalTurnovers;
	}
}
