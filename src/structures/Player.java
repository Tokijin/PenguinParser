package structures;

public class Player
{

	public enum Position 
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
	
	public Player(String name, Position pos)
	{
		myName = name;
		naturalPosition = pos;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public Position getPosition()
	{
		return naturalPosition;
	}
	
}
