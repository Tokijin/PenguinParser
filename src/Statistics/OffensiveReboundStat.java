package statistics;

import java.util.Date;

public class OffensiveReboundStat extends AbstractGameStatistic
{
	public OffensiveReboundStat(Date timestamp, String playerName)
	{
		setPlayerName(playerName);
		setType( StatType.OFFENSIVE_REBOUND );
		setTime( timestamp );
		setSuccess( true );
	}
}
