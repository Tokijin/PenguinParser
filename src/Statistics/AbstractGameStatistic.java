package statistics;

import java.util.Date;

public abstract class AbstractGameStatistic
{
	// Private fields
	private boolean success;

	// Package specific fields
	protected Date timestamp;
	protected StatType type;
	
	// Stat name definitions
	public static enum StatType
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
		
		public String abbreviatedName;
		public String fullName;
		
		private StatType ( String longName, String shortName )
		{
			fullName = longName;
			abbreviatedName = shortName;
		}
	}
	
	protected void setTime( Date newTimestamp )
	{
		timestamp = newTimestamp;
	}
	
	protected void setType( StatType newType )
	{
		type = newType;
	}
	
	protected void setSuccess( boolean newSuccess )
	{
		success = newSuccess;
	}
	
	public StatType getType()
	{
		return type;
	}
	
	public Date getTime()
	{
		return timestamp;
	}
	
	public boolean getSuccess()
	{
		return success;
	}
	
	public String getShortName()
	{
		return type.abbreviatedName;
	}
	
	public String getFullName()
	{
		return type.fullName;
	}
}
