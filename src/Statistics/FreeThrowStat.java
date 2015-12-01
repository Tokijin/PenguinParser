package statistics;

import java.util.Date;

public class FreeThrowStat extends AbstractGameStatistic
{
	public FreeThrowStat( Date timestamp, boolean madeBucket )
	{
		setType( StatType.FREE_THROW );
		setTime( timestamp );
		setSuccess( madeBucket );
	}
}
