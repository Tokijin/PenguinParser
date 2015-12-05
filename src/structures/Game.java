package structures;

import java.util.ArrayList;
import statistics.*;

public class Game 
{
	private ArrayList<AbstractGameStatistic> gameStats;
	private float fieldGoalPercentage;
	private float freeThrowPercentage;
	private float threePointPercentage;
	private short totalFieldGoalAttempts;
	private short totalFieldGoalsMade;
	private short totalThreePointFieldGoalAttempts;
	private short totalThreePointFieldGoalsMade;
	private short totalFreeThrowAttempts;
	private short totalFreeThrowsMade;
	private short totalRebounds;
	private short totalDefensiveRebounds;
	private short totalOffensiveRebounds;
	private short totalAssists;
	private short totalSteals;
	private short totalBlocks;
	private short totalTurnovers;
	
	public Game()
	{
		gameStats = new ArrayList<AbstractGameStatistic>();
	}
	
	public Game(ArrayList<AbstractGameStatistic> stats)
	{
		gameStats = stats;
	}
	
	public void addStat(AbstractGameStatistic stat)
	{
		gameStats.add(stat);
	}
	
	// Calculates game statistics
	public void calculateStatistics()
	{
		calculateFieldGoalStatistics();
		calculateFreeThrowStatistics();
		calculateThreePointFieldGoalStatistics();
		calculateReboundStatistics();
		calculateTotalAssists();
		calculateTotalSteals();
		calculateTotalBlocks();
		calculateTotalTurnovers();
	}
	
	private void calculateFieldGoalStatistics()
	{		
		// Loop through each stat for the game:
		for (AbstractGameStatistic stat : gameStats)
		{
			// If the current stat was a FG or 3PFG:
			if (stat.getType() == StatType.FIELD_GOAL || stat.getType() == StatType.THREE_PT_FIELD_GOAL)
			{
				// Increment total count
				this.totalFieldGoalAttempts++;
				
				// Increment made buckets as necessary:
				if (stat.getSuccess())
				{
					this.totalFieldGoalsMade++;
				}		
			}
		}
		
		this.fieldGoalPercentage = ((float)this.totalFieldGoalsMade / (float)this.totalFieldGoalAttempts);
	}
	
	private void calculateFreeThrowStatistics()
	{	
		// Loop through each stat for the game:
		for (AbstractGameStatistic stat : gameStats)
		{
			// If the current stat was a FT:
			if (stat.getType() == StatType.FREE_THROW)
			{
				// Increment total count
				this.totalFreeThrowAttempts++;
				
				// Increment made free throws as necessary:
				if (stat.getSuccess())
				{
					this.totalFreeThrowsMade++;
				}
			}	
		}
		
		this.freeThrowPercentage = ((float)this.totalFreeThrowsMade / (float)this.totalFreeThrowAttempts);
	}
	
	private void calculateThreePointFieldGoalStatistics()
	{	
		// Loop through each stat for the game:
		for (AbstractGameStatistic stat : gameStats)
		{
			// If the current stat was a 3PT:
			if (stat.getType() == StatType.THREE_PT_FIELD_GOAL)
			{
				// Increment total count
				this.totalThreePointFieldGoalAttempts++;
				
				// Increment made buckets as necessary:
				if (stat.getSuccess())
				{
					this.totalThreePointFieldGoalsMade++;
				}
			}
		}
		
		this.threePointPercentage = ((float)this.totalThreePointFieldGoalsMade / (float)this.totalThreePointFieldGoalAttempts);
	}
	
	private void calculateReboundStatistics()
	{
		for (AbstractGameStatistic stat : gameStats)
		{
			if (stat.getType() == StatType.DEFENSIVE_REBOUND)
			{
				this.totalDefensiveRebounds++;
				this.totalRebounds++;
			}
			
			if (stat.getType() == StatType.OFFENSIVE_REBOUND)
			{
				this.totalOffensiveRebounds++;
				this.totalRebounds++;
			}
		}
	}
	
	private void calculateTotalAssists()
	{
		for (AbstractGameStatistic stat : gameStats)
		{
			if (stat.getType() == StatType.ASSIST)
			{
				this.totalAssists++;
			}
		}
	}
	
	private void calculateTotalSteals()
	{
		for (AbstractGameStatistic stat : gameStats)
		{
			if (stat.getType() == StatType.STEAL)
			{
				this.totalSteals++;
			}
		}
	}
	
	private void calculateTotalBlocks()
	{
		for (AbstractGameStatistic stat : gameStats)
		{
			if (stat.getType() == StatType.BLOCK)
			{
				this.totalBlocks++;
			}
		}
	}
	
	private void calculateTotalTurnovers()
	{
		for (AbstractGameStatistic stat : gameStats)
		{
			if (stat.getType() == StatType.TURNOVER)
			{
				this.totalTurnovers++;
			}
		}
	}
	
	public float getFieldGoalPercentage()
	{
		return this.fieldGoalPercentage;
	}
	
	public float getFreeThrowPercentage()
	{
		return this.freeThrowPercentage;
	}
	
	public float getThreePointPercentage()
	{
		return this.threePointPercentage;
	}
	
	public short getTotalRebounds()
	{
		return this.totalRebounds;
	}
	
	public short getTotalDefensiveRebounds()
	{
		return this.totalDefensiveRebounds;
	}
	
	public short getTotalOffensiveRebounds()
	{
		return this.totalOffensiveRebounds;
	}
	
	public short getTotalAssists()
	{
		return this.totalAssists;
	}
	
	public short getTotalSteals()
	{
		return this.totalSteals;
	}
	
	public short getTotalBlocks()
	{
		return this.totalBlocks;
	}
	
	public short getTotalTurnovers()
	{
		return this.totalTurnovers;
	}
}
