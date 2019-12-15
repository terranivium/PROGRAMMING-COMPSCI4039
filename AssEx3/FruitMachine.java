/* 
2460681S, Wesley Scott

FruitMachine.java provides the player with 100 credits, and allows for the spin of 3 card slots.
Depending on the results of those cards, the player balance will be updated.

Possible Outcomes:
2 of a kind = +20 credits
3 of a kind = +50 credits
1 Joker = -25 credits
2 Jokers = -50 credits
3 Jokers = -75 credits

When the player's balance reaches 150, victory is achieved - however pass below 0 balance and the player is defeated.

Class Summary:
FruitMachine.java: Main method, creates instances of MVC classes
FruitModel.java: Game Model
FruitController.java: Game Controller
FruitView.java: Game View/Interface
	FruitButtonPanel.java: Contains view elements of spin and new game buttons.
	FruitStatusPanel.java: View elements providing balance updates and victory messages to player.
	FruitSlotPanel.java: View elements for the three card slots.
*/

public class FruitMachine{
	
	// Runtime method, creates MVC class instances
	public static void main(String[] args){
		FruitModel model = new FruitModel(); // New model instance
		FruitController controller = new FruitController(model); // New controller instance, is provided model
		FruitView view = new FruitView(controller, model); // New view instance, is provided controller and model

		controller.setView(view); // Set applicable view in controller
		view.setVisible(true); // Set GUI as visible
	}
}