package structures;

import java.util.ArrayList;

public class Player
{
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

	private String   myName;
	private Position naturalPosition;
	private ArrayList<Game> gamesPlayed;
	
	public Player(String name, Position pos)
	{
		gamesPlayed     = new ArrayList<Game>();
		myName          = name;
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
	
	public Game getGame( int gameIndex )
	{
		return gamesPlayed.get( gameIndex );
	}
}
