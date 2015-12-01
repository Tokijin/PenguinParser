package statistics;

import java.util.Date;

public class TurnoverStat extends AbstractGameStatistic
{
	public TurnoverStat( Date timestamp )
	{
		setType( StatType.TURNOVER );
		setTime( timestamp );
		setSuccess( true );
	}
}
