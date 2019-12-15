// 2460681S, Wesley Scott

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

// Game Button Panel
public class FruitButtonPanel extends JPanel{
		
	private JButton buttonSpin;
	private JButton buttonNewGame;

	public FruitButtonPanel(ActionListener parent){
		// Set layout manager for button panel
		this.setLayout(new GridLayout(2, 1));

		// Create NewGame and Spin buttons
		this.buttonSpin = new JButton("<html><b><u>Take a Spin!</u></b>");
		this.buttonNewGame = new JButton("<html><b><u>Start New Game</u></b>");

		// Manual position adjustment, removes button graphic
		this.buttonSpin.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.buttonNewGame.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		// Set text alignment
		this.buttonSpin.setHorizontalAlignment(JButton.LEFT);
		this.buttonNewGame.setHorizontalAlignment(JButton.LEFT);

		// Provide event tracking to buttons
		this.buttonSpin.addActionListener(parent);
		this.buttonNewGame.addActionListener(parent);

		// Add buttons to the button pannel
		this.add(buttonSpin);
		this.add(buttonNewGame);
	}

	public void setSpinButton(JButton newSpinButton){
		this.buttonSpin = newSpinButton;
	}

	// Getter for spin button (used for input source check)
	public JButton getSpinButton(){
		return this.buttonSpin;
	}

	public void setNewGameButton(JButton newNewGameButton){
		this.buttonNewGame = newNewGameButton;
	}

	// Getter for new game button (used for input source check)
	public JButton getNewGameButton(){
		return this.buttonNewGame;
	}
	
	// Button view states
	public void buttonState(boolean gameState){
		if(gameState){ // While game is active, spin button enabled, new game disabled.
			this.buttonSpin.setEnabled(true);
			this.buttonNewGame.setEnabled(false);
		} else if(!gameState){ // If game is win/loss, spin button disabled, new game enabled.
			this.buttonNewGame.setEnabled(true);
			this.buttonSpin.setEnabled(false);
		} 
	}
}

