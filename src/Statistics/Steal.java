package statistics;

import java.util.Date;

public class Steal extends AbstractGameStatistic 
{
	public Steal(Date timestamp)
	{
		this.timestamp = timestamp;
	}
	
	public Date getStealTime()
	{
		return this.timestamp;
	}
}
