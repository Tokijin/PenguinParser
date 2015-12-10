package structures;

import java.util.ArrayList;

public class PlayerSeasonStats 
{
	private String seasonName;
	private ArrayList<PlayerGameStats> gameStats;
	private short totalPoints;
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
	
	public PlayerSeasonStats(String seasonName, PlayerGameStats newGameStats)
	{
		this.seasonName = seasonName;
		this.gameStats = new ArrayList<PlayerGameStats>();
		this.gameStats.add(newGameStats);
	}
	
	public void addPlayerGameStats(PlayerGameStats gameStats)
	{
		this.gameStats.add(gameStats);
	}
	
	public String getSeasonName() 
	{
		return seasonName;
	}
	
	public void setSeasonName(String seasonName) 
	{
		this.seasonName = seasonName;
	}
	
	public ArrayList<PlayerGameStats> getGameStats() 
	{
		return gameStats;
	}
	
	public void setGameStats(ArrayList<PlayerGameStats> gameStats) 
	{
		this.gameStats = gameStats;
	}
	
	public short getTotalPoints() 
	{
		return totalPoints;
	}
	
	public void setTotalPoints(short totalPoints) 
	{
		this.totalPoints = totalPoints;
	}
	
	public float getFieldGoalPercentage() 
	{
		return fieldGoalPercentage;
	}
	
	public void setFieldGoalPercentage(float fieldGoalPercentage) 
	{
		this.fieldGoalPercentage = fieldGoalPercentage;
	}
	
	public float getFreeThrowPercentage() 
	{
		return freeThrowPercentage;
	}
	
	public void setFreeThrowPercentage(float freeThrowPercentage) 
	{
		this.freeThrowPercentage = freeThrowPercentage;
	}
	
	public float getThreePointPercentage() 
	{
		return threePointPercentage;
	}
	
	public void setThreePointPercentage(float threePointPercentage) 
	{
		this.threePointPercentage = threePointPercentage;
	}
	
	public short getTotalFieldGoalAttempts() 
	{
		return totalFieldGoalAttempts;
	}
	
	public void setTotalFieldGoalAttempts(short totalFieldGoalAttempts) 
	{
		this.totalFieldGoalAttempts = totalFieldGoalAttempts;
	}
	
	public short getTotalFieldGoalsMade() 
	{
		return totalFieldGoalsMade;
	}
	
	public void setTotalFieldGoalsMade(short totalFieldGoalsMade) 
	{
		this.totalFieldGoalsMade = totalFieldGoalsMade;
	}
	
	public short getTotalThreePointFieldGoalAttempts() 
	{
		return totalThreePointFieldGoalAttempts;
	}
	
	public void setTotalThreePointFieldGoalAttempts(short totalThreePointFieldGoalAttempts) 
	{
		this.totalThreePointFieldGoalAttempts = totalThreePointFieldGoalAttempts;
	}
	
	public short getTotalThreePointFieldGoalsMade() 
	{
		return totalThreePointFieldGoalsMade;
	}
	
	public void setTotalThreePointFieldGoalsMade(short totalThreePointFieldGoalsMade) 
	{
		this.totalThreePointFieldGoalsMade = totalThreePointFieldGoalsMade;
	}
	
	public short getTotalFreeThrowAttempts() 
	{
		return totalFreeThrowAttempts;
	}
	
	public void setTotalFreeThrowAttempts(short totalFreeThrowAttempts)
	{
		this.totalFreeThrowAttempts = totalFreeThrowAttempts;
	}
	
	public short getTotalFreeThrowsMade() 
	{
		return totalFreeThrowsMade;
	}
	
	public void setTotalFreeThrowsMade(short totalFreeThrowsMade) 
	{
		this.totalFreeThrowsMade = totalFreeThrowsMade;
	}
	
	public short getTotalRebounds() 
	{
		return totalRebounds;
	}
	
	public void setTotalRebounds(short totalRebounds) 
	{
		this.totalRebounds = totalRebounds;
	}
	
	public short getTotalDefensiveRebounds() 
	{
		return totalDefensiveRebounds;
	}
	
	public void setTotalDefensiveRebounds(short totalDefensiveRebounds) 
	{
		this.totalDefensiveRebounds = totalDefensiveRebounds;
	}
	
	public short getTotalOffensiveRebounds() 
	{
		return totalOffensiveRebounds;
	}
	
	public void setTotalOffensiveRebounds(short totalOffensiveRebounds) 
	{
		this.totalOffensiveRebounds = totalOffensiveRebounds;
	}
	
	public short getTotalAssists() 
	{
		return totalAssists;
	}
	
	public void setTotalAssists(short totalAssists) 
	{
		this.totalAssists = totalAssists;
	}
	
	public short getTotalSteals() 
	{
		return totalSteals;
	}
	
	public void setTotalSteals(short totalSteals) 
	{
		this.totalSteals = totalSteals;
	}
	
	public short getTotalBlocks() 
	{
		return totalBlocks;
	}
	
	public void setTotalBlocks(short totalBlocks) 
	{
		this.totalBlocks = totalBlocks;
	}
	
	public short getTotalTurnovers() 
	{
		return totalTurnovers;
	}
	
	public void setTotalTurnovers(short totalTurnovers) 
	{
		this.totalTurnovers = totalTurnovers;
	}
	
	
}
