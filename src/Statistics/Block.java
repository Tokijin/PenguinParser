package statistics;

import java.util.Date;

public class Block extends AbstractGameStatistic
{
	public Block(Date timestamp)
	{
		this.timestamp = timestamp;
	}
	
	public Date getBlockTime()
	{
		return this.timestamp;
	}
}
