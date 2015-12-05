package statistics;

import java.util.Date;

public abstract class AbstractGameStatistic
{
	// Private fields
	private boolean success;
	private String playerName;
	
	// Package specific fields
	protected Date timeStamp;
	protected StatType type;
	
	public AbstractGameStatistic()
	{
		this.success = false;
		this.playerName = null;
		this.timeStamp = null;
		this.type = null;
	}

	protected void setTime( Date newTimestamp )
	{
		this.timeStamp = newTimestamp;
	}
	
	protected void setType( StatType newType )
	{
		this.type = newType;
	}
	
	protected void setSuccess( boolean newSuccess )
	{
		this.success = newSuccess;
	}
	
	protected void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	
	public StatType getType()
	{
		return type;
	}
	
	public Date getTime()
	{
		return timeStamp;
	}
	
	public boolean getSuccess()
	{
		return success;
	}
	
	public String getPlayerName()
	{
		return this.playerName;
	}
}
