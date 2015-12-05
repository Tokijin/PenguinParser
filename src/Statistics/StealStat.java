package statistics;

import java.util.Date;

public class StealStat extends AbstractGameStatistic
{
	public StealStat(Date timestamp, String playerName)
	{
		setPlayerName(playerName);
		setType(StatType.STEAL);
		setTime(timestamp);
		setSuccess(true);
	}
}
