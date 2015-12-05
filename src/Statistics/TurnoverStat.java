package statistics;

import java.util.Date;

public class TurnoverStat extends AbstractGameStatistic
{
	public TurnoverStat(Date timestamp, String playerName)
	{
		setPlayerName(playerName);
		setType( StatType.TURNOVER );
		setTime( timestamp );
		setSuccess( true );
	}
}
