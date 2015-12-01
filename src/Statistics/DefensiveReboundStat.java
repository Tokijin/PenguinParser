package statistics;

import java.util.Date;

public class DefensiveReboundStat extends AbstractGameStatistic
{
	public DefensiveReboundStat( Date timestamp )
	{
		setType( StatType.DEFENSIVE_REBOUND );
		setTime( timestamp );
		setSuccess( true );
	}
}
