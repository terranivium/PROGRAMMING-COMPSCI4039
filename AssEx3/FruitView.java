// 2460681S, Wesley Scott

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;

public class FruitView extends JFrame{

	private FruitController controller;
	private FruitModel model;

	// View panels (extending JPanel)
	private FruitStatusPanel statusPanel;
	private FruitSlotPanel slotPanel;
	private FruitButtonPanel buttonPanel;

	// View constructor
	public FruitView(FruitController controller, FruitModel model){
		this.controller = controller;
		this.model = model;

		// Main JFrame View Settings
		this.setSize(360,240); // Set window/frame size
		this.setResizable(false); // Lock window/frame size
		this.setLocation(100,100); // Set window/frame open location on screen
		this.setTitle("FruitMachine, 2460681S"); // Set window/frame title bar text
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stop run on window/frame close
		this.setLayout(new GridBagLayout()); // Set layout manager for JFrame
		
		GridBagConstraints c = new GridBagConstraints(); // Holds constraints for gridbag layout manager
		c.fill = GridBagConstraints.HORIZONTAL;

		// Create new reference to status panel
		this.statusPanel = new FruitStatusPanel();
		c.weighty = 0.25;
		this.add(this.statusPanel, c); // Add status panel to JFrame with layout constraints

		// Create new reference to card slot panel
		this.slotPanel = new FruitSlotPanel();
		c.ipady = 20;
		c.weightx = 0.15;
		c.weighty = 0.25;
		c.gridheight = 3;
		c.gridy = 1;
		this.add(this.slotPanel, c); // Add card slot panel to JFrame with layout constraints

		// Create new reference to button panel
		this.buttonPanel = new FruitButtonPanel(this.controller);
		c.ipadx = 20;
		c.weightx = 0.0;
		c.gridx = 1;
		this.add(this.buttonPanel, c); // Add button panel to JFrame with layout constraints

		// Initial View states
		this.buttonPanel.buttonState(false); // Initial button state
		this.statusPanel.updateBalance(this.model.getPlayerBalance()); // Initial balance
		this.statusPanel.updateStatus(String.format("")); // Reset status text
		this.statusPanel.updateVictory(""); // Initial victory status text
	}

	public FruitController getController() {
		return this.controller;
	}

	public void setController(FruitController controller) {
		this.controller = controller;
	}

	public FruitModel getModel() {
		return this.model;
	}

	public void setModel(FruitModel model) {
		this.model = model;
	}

	public FruitStatusPanel getStatusPanel() {
		return this.statusPanel;
	}

	public void setStatusPanel(FruitStatusPanel statusPanel) {
		this.statusPanel = statusPanel;
	}

	public FruitSlotPanel getSlotPanel() {
		return this.slotPanel;
	}

	public void setSlotPanel(FruitSlotPanel slotPanel) {
		this.slotPanel = slotPanel;
	}

	// Used for access to individual buttons for input source check
	public FruitButtonPanel getButtonPanel(){
		return this.buttonPanel;
	}

	public void setButtonPanel(FruitButtonPanel buttonPanel) {
		this.buttonPanel = buttonPanel;
	}

	// View state called on new game button press
	public void newGameState(){
		String[] emptyCards = {" "," "," "}; 
		this.slotPanel.updateText(emptyCards); // reset card slot display to empty
		this.statusPanel.updateBalance(this.model.getPlayerBalance()); // New Game balance
		this.statusPanel.updateStatus(String.format("Press spin to get your cards!")); // New Game status message
		this.statusPanel.updateVictory(""); // Reset victory status text
		this.buttonPanel.buttonState(true); // Set button enable/disable state
	}

	// View state update, called on spin button press
	public void spinState(){
		this.slotPanel.updateText(this.model.getSelectedCards());
		this.statusPanel.updateBalance(this.model.getPlayerBalance());
		this.statusPanel.updateStatus(this.model.getStatusText());
		if(this.model.getPlayerBalance() >= 150){
			victoryState();
		} else if(this.model.getPlayerBalance() <= 0){
			defeatState();
		} else ;
	}

	// View state called on player victory
	public void victoryState(){
		this.buttonPanel.buttonState(false); // Set button enable/disable state
		this.statusPanel.updateVictory("You win! Play again?"); // View update
	}

	// View state called on player defeat
	public void defeatState(){
		this.buttonPanel.buttonState(false); // Set button enable/disable state
		this.statusPanel.updateVictory("You lose! Try again?"); // View update
	}
}