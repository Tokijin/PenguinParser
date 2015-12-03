package structures;

import java.util.ArrayList;

public class PlayerDatabase {

	private ArrayList<Player> team;
	private String teamName;
	
	public PlayerDatabase( String teamName )
	{
		this.team     = new ArrayList<Player>();
		this.teamName = teamName;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	
	public Player getPlayerByIndex( int playerIndex )
	{
		return team.get( playerIndex );
	}
	
	public Player getPlayerByName( String playerName )
	{
		// Check the name of each player on the team:
		for ( Player currentPlayer : team )
		{
			if ( currentPlayer.getName().equalsIgnoreCase(playerName) )
				return currentPlayer;
		}
		
		// Return null if player not found
		return null;
	}
}
