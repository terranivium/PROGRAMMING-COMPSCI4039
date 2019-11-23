//import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FruitSlotPanel extends JPanel{
private JLabel slotLeft;
private JLabel slotMid;
private JLabel slotRight;

	public FruitSlotPanel(){
		this.setLayout(new GridLayout());

		slotLeft = new JLabel("Kiss");
		slotMid = new JLabel("My");
		slotRight = new JLabel("ASS");

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
