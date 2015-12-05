package io;

import structures.*;
import statistics.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GameReader
{	
	public Game readGame(String fileName) 
	throws FileNotFoundException
	{
		ArrayList<AbstractGameStatistic> stats = new ArrayList<AbstractGameStatistic>();
		FileReader gameFile = new FileReader(fileName);
		Scanner readGameFile = new Scanner(gameFile);
		
		while (readGameFile.hasNextLine())
		{
			String currentLine = readGameFile.nextLine();
			
			Scanner in = new Scanner(currentLine);
			in.useDelimiter(",");
			
			// NEED TO REPLACE DATE WITH SOMETHING BETTER
			Date timeStamp = new Date(in.next());
			String playerName = in.next();
			String statTypeString = in.next();
			StatType statType = null;
			
			// Search for stat type with matching string
			for (StatType s : StatType.values())
			{
				if (s.getFullName().equalsIgnoreCase(statTypeString) || s.getAbbreviatedName().equalsIgnoreCase(statTypeString))
					statType = s;
			}
			
			// Determine what type of stat this is, create the stat, add it to the list of stats
			switch (statType)
			{
				case FIELD_GOAL:
					stats.add(new FieldGoalStat(timeStamp, playerName, in.nextBoolean()));
					break;
				case THREE_PT_FIELD_GOAL:
					stats.add(new ThreePointFieldGoalStat(timeStamp, playerName, in.nextBoolean()));
					break;
				case FREE_THROW:
					stats.add(new FreeThrowStat(timeStamp, playerName, in.nextBoolean()));
					break;
				case OFFENSIVE_REBOUND:
					stats.add(new OffensiveReboundStat(timeStamp, playerName));
					break;
				case DEFENSIVE_REBOUND:
					stats.add(new DefensiveReboundStat(timeStamp, playerName));
					break;
				case ASSIST:
					stats.add(new AssistStat(timeStamp, playerName, in.next()));
					break;
				case BLOCK:
					stats.add(new BlockStat(timeStamp, playerName));
					break;
				case STEAL:
					stats.add(new StealStat(timeStamp, playerName));
					break;
				case TURNOVER:
					stats.add(new TurnoverStat(timeStamp, playerName));
					break;
				default:
					// Throw exception
					break;
			}
			
			in.close();
		}
		
		// Create a game with all of the stats
		Game newGame = new Game(stats);
		
		readGameFile.close();
		
		return newGame;
	}
}
