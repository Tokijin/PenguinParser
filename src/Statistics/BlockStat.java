package statistics;

import java.util.Date;

public class BlockStat extends AbstractGameStatistic
{
	public BlockStat( Date timestamp )
	{
		setType( StatType.BLOCK );
		setTime( timestamp );
		setSuccess( true );
	}
}
