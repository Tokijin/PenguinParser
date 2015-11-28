package visual;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class PenguinParser extends JFrame
{
	private JPanel  mainPanel;
	private JTextField CSVTextField;
	private JButton browseCSVButton;
	private JButton addToCurrentDatabaseButton;
	private JButton loadDatabaseButton;
	private JButton saveDatabaseButton;
	private JButton newQueryButton;
	
	public PenguinParser( String windowName )
	{ 
		super( windowName );
		
		mainPanel            = new JPanel();
		JPanel CSVSubPanel   = new JPanel();
		JPanel querySubPanel = new JPanel();
		
		// Set the layout for the panels
		CSVSubPanel.setLayout(   new GridLayout( 1, 3, 5, 5 ) );
		querySubPanel.setLayout( new GridLayout( 1, 3, 5, 5 ) );
		mainPanel.setLayout(     new BorderLayout()           );

		// Create the fields for the CSV panel
		CSVTextField               = new JTextField( "C:\\CSV File location" );
		browseCSVButton            = new JButton( "Browse"    );
		addToCurrentDatabaseButton = new JButton( "Add to DB" );
		
		// Create the buttons for the query panel
		loadDatabaseButton = new JButton( "Load DB" );
		saveDatabaseButton = new JButton( "Save DB" );
		newQueryButton     = new JButton( "Query"   );

		// Add the CSV related fields and buttons
		CSVSubPanel.add( CSVTextField    );
		CSVSubPanel.add( browseCSVButton );
		CSVSubPanel.add( addToCurrentDatabaseButton );
		
		// Add the appropriate buttons to the second panel
		querySubPanel.add( loadDatabaseButton );
		querySubPanel.add( saveDatabaseButton );
		querySubPanel.add( newQueryButton     );
		
		// Add the smaller components to the main panel
		mainPanel.add( CSVSubPanel, BorderLayout.NORTH );
		mainPanel.add( querySubPanel, BorderLayout.SOUTH );

		super.getContentPane().add( mainPanel, BorderLayout.CENTER );
		super.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		super.pack();
		super.setVisible( true );
	}
}
