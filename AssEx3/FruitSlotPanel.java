import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class FruitSlotPanel extends JPanel{
private JLabel slotLeft;
private JLabel slotMid;
private JLabel slotRight;

	public FruitSlotPanel(){
		this.setLayout(new GridLayout(1, 3));

		slotLeft = new JLabel();
		slotMid = new JLabel();
		slotRight = new JLabel();

		this.add(slotLeft);
		this.add(slotMid);
		this.add(slotRight);
	}
	
	public void updateText(String[] cards){
		slotLeft.setText(cards[0]);
		slotMid.setText(cards[1]);
		slotRight.setText(cards[2]);
	}

}
