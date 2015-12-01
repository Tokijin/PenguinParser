package statistics;

import java.util.Date;

import structures.Player;

public class AssistStat extends AbstractGameStatistic
{
	private Player recipient;
	
	public AssistStat( Date timestamp, Player target )
	{
		setType( StatType.ASSIST );
		setTime( timestamp );
		setSuccess( true );
		recipient = target;
	}	
	
	public Player getRecipient()
	{
		return recipient;
	}
}
