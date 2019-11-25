// 2460681S, Wesley Scott

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

// Game button panel
public class FruitButtonPanel extends JPanel{
private JButton buttonSpin;
private JButton buttonNewGame;

	public FruitButtonPanel(ActionListener parent){
		// Set layout manager for button panel
		this.setLayout(new GridLayout(2, 1));

		// Create NewGame and Spin buttons
		buttonSpin = new JButton("take a spin!");
		buttonNewGame = new JButton("start new game");

		// Add action listeners to buttons
		buttonSpin.addActionListener(parent);
		buttonNewGame.addActionListener(parent);

		// Add buttons to the button pannel
		this.add(buttonSpin);
		this.add(buttonNewGame);
	}
	
	// Set button state
	public void buttonState(boolean gameState){
		if(gameState){ // If game is active, spin button enabled, new game disabled.
			buttonSpin.setEnabled(true);
			buttonNewGame.setEnabled(false);
		} else if(!gameState){ // If game is inactive, spin button disabled, new game enabled.
			buttonNewGame.setEnabled(true);
			buttonSpin.setEnabled(false);
		} 
	}
	// Get spin button (for source check)
	public JButton getSpinButton() {
		return this.buttonSpin;
	}

	// Get new game button (for source check)
	public JButton getNewGameButton() {
		return this.buttonNewGame;
	}
}

