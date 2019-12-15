// 2460681S, Wesley Scott

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FruitController implements ActionListener{
	private FruitView view;
	private FruitModel model;

	public FruitController(FruitModel model){
		this.model = model;
		this.view = null; // Null until setView called in main
	}

	public void setView(FruitView newView){
		// View is set for controller by main method
		this.view = newView;
	}

	public FruitView getView(){
		return this.view;
	}

	public void setModel(FruitModel newModel){
		this.model = newModel;
	}

	public FruitModel getModel(){
		return this.model;
	}


	// Method call on user input
	public void actionPerformed(ActionEvent e){
		// If spin button is pressed
		if (e.getSource() == this.view.getButtonPanel().getSpinButton()){
			this.model.updateSlots(); // Select 3 new cards
			this.model.checkSlots(); // Check those cards to update the play balance
			this.view.spinState(); // Update the view to display new cards and outcome to player
		// If new game button is pressed
		} else if (e.getSource() == this.view.getButtonPanel().getNewGameButton()){
			this.model.setPlayerBalance(100); // Re-initialise current player balance
			this.view.newGameState(); // Reset view to initial game state
		}
	}
}