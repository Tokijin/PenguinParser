import visual.PenguinParser;
import structures.*;
import io.*;

public class PenguinParserMain 
{
	private static final String DEFAULT_WINDOW_NAME = "Penguin Parser";
	private static PenguinParser myParser;
	private static SeasonDatabase seasons;
	
	public static void main(String[] args)
	{
		Season season = new Season();
		season.setSeasonName("Winter 2015");
		season.addPlayer(new Player("Yellow Mamba", Player.Position.SMALL_FORWARD));
		season.addPlayer(new Player("Toki", Player.Position.POWER_FORWARD));
		Game newGame = IOManager.readGame("week1.csv");
		newGame.calculateStatistics();
		season.addGame(newGame);
		
		seasons.addSeason(season);
		IOManager.saveData(seasons);
		
		// For after first time
		//seasons = IOManager.loadData();
		myParser = new PenguinParser( DEFAULT_WINDOW_NAME );
	}
}
