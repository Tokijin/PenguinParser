package statistics;

import java.util.Date;

import structures.Player;

public class AssistStat extends AbstractGameStatistic
{
	private String recipientPlayerName;
	
	public AssistStat(Date timestamp, String playerName, String recipientPlayerName)
	{
		setPlayerName(playerName);
		setType(StatType.ASSIST);
		setTime(timestamp);
		setSuccess(true);
		setReceipientPlayerName(recipientPlayerName);
	}	
	
	public String getRecipientPlayerName()
	{
		return recipientPlayerName;
	}
	
	public void setReceipientPlayerName(String recipientPlayerName)
	{
		this.recipientPlayerName = recipientPlayerName;
	}
}
