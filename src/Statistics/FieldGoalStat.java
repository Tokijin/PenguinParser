package statistics;

import java.util.Date;

public class FieldGoalStat extends AbstractGameStatistic
{
	public FieldGoalStat( Date timestamp, boolean madeBucket )
	{
		setType( StatType.FIELD_GOAL );
		setTime( timestamp );
		setSuccess( madeBucket );
	}
}
