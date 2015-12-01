package structures;

import java.util.ArrayList;
import statistics.*;
import statistics.AbstractGameStatistic.StatType;

public class Game {

	private ArrayList<AbstractGameStatistic> gameStats;
	
	public Game()
	{
		gameStats = new ArrayList<AbstractGameStatistic>();
	}
	
	public Game( ArrayList<AbstractGameStatistic> stats )
	{
		gameStats = stats;
	}
	
	public void addStat( AbstractGameStatistic stat )
	{
		gameStats.add( stat );
	}
	
	public float getFieldGoalPercentageString()
	{
		float fieldGoalPercent;
		short madeShots = 0;
		short totalShots = 0;
		
		// Loop through each stat for the game:
		for ( AbstractGameStatistic stat : gameStats )
		{
			
			// If the current stat was a FG:
			if ( stat.getType() == StatType.FIELD_GOAL )
			{
				// Increment total count
				totalShots++;
				
				// Increment made buckets as necessary:
				if ( stat.getSuccess() )
				{
					madeShots++;
				}
				
			}
			
		}
		
		fieldGoalPercent = ( (float) madeShots / (float) totalShots );
		
		return fieldGoalPercent;
	}
	
	public float getFreeThrowPercentageString()
	{
		float freeThrowPercent;
		short madeFreeThrows = 0;
		short totalFreeThrows = 0;
		
		// Loop through each stat for the game:
		for ( AbstractGameStatistic stat : gameStats )
		{
			
			// If the current stat was a FT:
			if ( stat.getType() == StatType.FREE_THROW )
			{
				// Increment total count
				totalFreeThrows++;
				
				// Increment made free throws as necessary:
				if ( stat.getSuccess() )
				{
					madeFreeThrows++;
				}
				
			}
			
		}
		
		freeThrowPercent = ( (float)madeFreeThrows / (float) totalFreeThrows );
		
		return freeThrowPercent;
	}
	
	public float getThreePointPercentageString()
	{
		float threePointPercent;
		short madeShots = 0;
		short totalShots = 0;
		
		// Loop through each stat for the game:
		for ( AbstractGameStatistic stat : gameStats )
		{
			
			// If the current stat was a 3PT:
			if ( stat.getType() == StatType.THREE_PT_FIELD_GOAL )
			{
				// Increment total count
				totalShots++;
				
				// Increment made buckets as necessary:
				if ( stat.getSuccess() )
				{
					madeShots++;
				}
				
			}
			
		}
		
		threePointPercent = ( (float) madeShots / (float) totalShots );
		
		return threePointPercent;
	}
}
