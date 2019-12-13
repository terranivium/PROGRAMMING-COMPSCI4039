// 2460681S, Wesley Scott

public class FruitMachine{
	public static void main(String[] args){
		FruitModel model = new FruitModel();
		FruitController controller = new FruitController(model);
		FruitView view = new FruitView(controller, model);

		controller.setView(view);
		view.setVisible(true);
	}
}