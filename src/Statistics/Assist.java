package statistics;

import java.util.Date;

public class Assist extends AbstractGameStatistic 
{
	public Assist(Date timestamp)
	{
		this.timestamp = timestamp;
	}
	
	public Date getAssistTime()	
	{
		return this.timestamp;
	}
}
