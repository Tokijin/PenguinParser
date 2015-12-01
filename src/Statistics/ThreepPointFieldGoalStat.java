package statistics;

import java.util.Date;

public class ThreepPointFieldGoalStat extends AbstractGameStatistic
{
	public ThreepPointFieldGoalStat( Date timestamp, boolean madeBucket )
	{
		setType( StatType.THREE_PT_FIELD_GOAL );
		setTime( timestamp );
		setSuccess( madeBucket );
	}
}
