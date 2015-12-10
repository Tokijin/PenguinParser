package structures;

import java.util.ArrayList;
import java.io.*;

public class SeasonDatabase implements Serializable
{
	private static final long serialVersionUID = 1L;
	private ArrayList<Season> seasons;
	
	public SeasonDatabase()
	{
		seasons = new ArrayList<Season>();
	}
	
	public SeasonDatabase(ArrayList<Season> seasons)
	{
		this.seasons = seasons;
	}
	
	public void addSeason(Season seasonToAdd)
	{
		this.seasons.add(seasonToAdd);
	}
	
	public Season getSeasonByName(String seasonName)
	{
		for (Season s : seasons)
		{
			if (s.getSeasonName().equalsIgnoreCase(seasonName))
			{
				return s;
			}
		}
		
		return null;
	}
}
