package statistics;

import java.util.Date;

public class DefensiveReboundStat extends AbstractGameStatistic
{
	public DefensiveReboundStat(Date timeStamp, String playerName) 
	{
		setType(StatType.DEFENSIVE_REBOUND);
		setPlayerName(playerName);
		setTime(timeStamp);
		setSuccess(true);
	}
}
