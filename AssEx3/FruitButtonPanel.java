// 2460681S, Wesley Scott

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

// Game button panel
public class FruitButtonPanel extends JPanel{
		
	private JButton buttonSpin;
	private JButton buttonNewGame;

	public FruitButtonPanel(ActionListener parent){
		// Set layout manager for button panel
		this.setLayout(new GridLayout(2, 1));

		// Create NewGame and Spin buttons
		this.buttonSpin = new JButton("<html><b>Take a Spin!</b>");
		this.buttonNewGame = new JButton("<html><b>Start New Game</b>");

		// Manual position adjustment, removes button graphic
		this.buttonSpin.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		this.buttonNewGame.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

		// Set text alignment
		this.buttonSpin.setHorizontalAlignment(JButton.LEFT);
		this.buttonNewGame.setHorizontalAlignment(JButton.LEFT);

		// Add action listeners to buttons
		this.buttonSpin.addActionListener(parent);
		this.buttonNewGame.addActionListener(parent);

		// Add buttons to the button pannel
		this.add(buttonSpin);
		this.add(buttonNewGame);
	}

	// Getter for spin button (for action event source check)
	public JButton getSpinButton(){
		return this.buttonSpin;
	}

	// Getter for new game button (for action event source check)
	public JButton getNewGameButton(){
		return this.buttonNewGame;
	}
	
	// Set button states
	public void buttonState(boolean gameState){
		if(gameState){ // If game is active, spin button enabled, new game disabled.
			this.buttonSpin.setEnabled(true);
			this.buttonNewGame.setEnabled(false);
		} else if(!gameState){ // If game is inactive, spin button disabled, new game enabled.
			this.buttonNewGame.setEnabled(true);
			this.buttonSpin.setEnabled(false);
		} 
	}
}

