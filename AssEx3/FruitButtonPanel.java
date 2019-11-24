import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class FruitButtonPanel extends JPanel{
private JButton buttonSpin;
private JButton buttonNewGame;

	public FruitButtonPanel(ActionListener parent){
		this.setLayout(new GridLayout(2, 1));

		buttonSpin = new JButton("take a spin!");
		buttonNewGame = new JButton("start new game");
		buttonSpin.addActionListener(parent);
		buttonNewGame.addActionListener(parent);

		this.add(buttonSpin);
		this.add(buttonNewGame);
	}
	
	public void buttonState(boolean gameState){
		if(gameState){
			buttonSpin.setEnabled(true);
			buttonNewGame.setEnabled(false);
		} else if(!gameState){
			buttonNewGame.setEnabled(true);
			buttonSpin.setEnabled(false);
		} 
	}

	public JButton getSpinButton() {
		return this.buttonSpin;
	}

	public JButton getNewGameButton() {
		return this.buttonNewGame;
	}
}

