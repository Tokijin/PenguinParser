package statistics;

import java.util.Date;

public class FieldGoalStat extends AbstractGameStatistic
{	
	public FieldGoalStat(Date timeStamp, String playerName, boolean madeBucket)
	{
		setTime(timeStamp);
		setPlayerName(playerName);
		setType(StatType.FIELD_GOAL);
		setSuccess(madeBucket);
	}
}
