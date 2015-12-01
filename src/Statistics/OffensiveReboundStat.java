package statistics;

import java.util.Date;

public class OffensiveReboundStat extends AbstractGameStatistic
{
	public OffensiveReboundStat( Date timestamp )
	{
		setType( StatType.OFFENSIVE_REBOUND );
		setTime( timestamp );
		setSuccess( true );
	}
}
