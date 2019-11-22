//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class FruitButtonPanel extends JPanel{
private JButton buttonSpin;
private JButton buttonNewGame;

	public FruitButtonPanel(ActionListener parent){
		this.setLayout(new FlowLayout());

		buttonSpin = new JButton("take a spin!");
		buttonNewGame = new JButton("start new game")
		buttonSpin.addActionListener(parent);
		buttonNewGame.addActionListener(parent);

		this.add(buttonSpin);
		this.add(buttonNewGame);

		buttonSpin.setEnable(false);
		buttonNewGame.setEnable(true);
	}
	
	public void buttonState(boolean gameState){
		if(buttonNewGame.getModel().isPressed()){
        	System.out.println("New Game Start");
			buttonSpin.setEnable(true);
			buttonNewGame.setEnable(false);
		if(buttonSpin.getModel().isPressed()){
			if(gameState == true){
				buttonNewGame.setEnable(true);
				buttonSpin.setEnable(false);
			} 
		}
		}
	}
}
