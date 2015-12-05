package statistics;

import java.util.Date;

public class ThreePointFieldGoalStat extends AbstractGameStatistic
{
	public ThreePointFieldGoalStat( Date timestamp, String playerName, boolean madeBucket )
	{
		setPlayerName(playerName);
		setType(StatType.THREE_PT_FIELD_GOAL);
		setTime( timestamp );
		setSuccess( madeBucket );
	}
}
