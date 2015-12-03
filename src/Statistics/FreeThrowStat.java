package statistics;

import java.util.Date;

public class FreeThrowStat extends AbstractGameStatistic
{
	public FreeThrowStat(Date timestamp, String playerName, boolean madeBucket)
	{
		setPlayerName(playerName);
		setType(StatType.FREE_THROW);
		setTime(timestamp);
		setSuccess(madeBucket);
	}
}
