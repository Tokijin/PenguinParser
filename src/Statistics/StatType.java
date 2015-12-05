package statistics;

public enum StatType 
{
	FIELD_GOAL ( "Field Goal", "FG" ),
	THREE_PT_FIELD_GOAL ( "3-Point Field Goal", "3PT" ),
	FREE_THROW ( "Free Throw", "FT" ),
	OFFENSIVE_REBOUND ( "Offensive Rebound", "OREB" ),
	DEFENSIVE_REBOUND ( "Defensive Rebound", "DREB" ),
	ASSIST ( "Assist", "AST" ),
	BLOCK ( "Block", "BLK" ),
	STEAL ( "Steal", "STL" ),
	TURNOVER ( "TURNOVER", "TO" );
	
	private String abbreviatedName;
	private String fullName;
	
	private StatType(String longName, String shortName)
	{
		this.fullName = longName;
		this.abbreviatedName = shortName;
	}
	
	public String getAbbreviatedName()
	{
		return this.abbreviatedName;
	}
	
	public String getFullName()
	{
		return this.fullName;
	}
}
