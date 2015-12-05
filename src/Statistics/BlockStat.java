package statistics;

import java.util.Date;

public class BlockStat extends AbstractGameStatistic
{
	public BlockStat(Date timestamp, String playerName)
	{
		setPlayerName(playerName);
		setType(StatType.BLOCK);
		setTime(timestamp);
		setSuccess(true);
	}
}
