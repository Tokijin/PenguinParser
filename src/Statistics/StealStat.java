package statistics;

import java.util.Date;

public class StealStat extends AbstractGameStatistic
{
	public StealStat( Date timestamp )
	{
		setType( StatType.STEAL );
		setTime( timestamp );
		setSuccess( true );
	}
}
