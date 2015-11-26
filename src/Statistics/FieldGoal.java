package Statistics;

import java.util.Date;

public class FieldGoal extends AbstractGameStatistic
{

	private boolean fieldGoalMade;
	
	public FieldGoal( boolean madeBucket, Date timestamp )
	{
		this.fieldGoalMade = madeBucket;
		this.timestamp = timestamp;
	}
	
	public Date getShotTakenDate()
	{
		return this.timestamp;
	}
}
