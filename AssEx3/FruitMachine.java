// 2460681S, Wesley Scott

/* 
FruitMachine provides the player with 100 credits, and allows for the spin of 3 card slots.
Depending on the results of those cards, the player balance will be updated.

Possible outcomes:
2 of a kind = 20 credits
3 of a kind = 50 credits
1 Joker = -25 credits
2 Jokers = -50 credits
3 Jokers = -75 credits!

Class rundown:
FruitMachine: main method, creates instances of MVC classes
FruitModel: Game Model
FruitController: Game Controller
FruitView: Game View/Interface
	FruitButtonPanel: Contains view elements of spin and new game buttons.
	FruitStatusPanel: View elements providing balance updates and victory messages to player.
	FruitSlotPanel: View elements for the three card slots.
*/

public class FruitMachine{
	
	// Main runtime method, creates MVC class instances
	public static void main(String[] args){
		FruitModel model = new FruitModel();
		FruitController controller = new FruitController(model);
		FruitView view = new FruitView(controller, model);

		controller.setView(view);
		view.setVisible(true);
	}
}