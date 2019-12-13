// 2460681S, Wesley Scott

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FruitController implements ActionListener{

	private FruitView view;
	private FruitModel model;

	public FruitController(FruitModel model){
		this.model = model;
		this.view = null;
	}

	public void setView(FruitView newView){
		this.view = newView;
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == this.view.getButtonPanel().getSpinButton()){
			this.model.updateSlots();
			this.model.checkSlots();
			// this.model.victoryCheck();
			this.view.spinState();

		} else if (e.getSource() == this.view.getButtonPanel().getNewGameButton()){
			this.model.setPlayerBalance(100);
			this.view.newGameState();
		}
	}
}