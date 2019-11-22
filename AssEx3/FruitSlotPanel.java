//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FruitSlotPanel extends JPanel{
private JTextField slotLeft;
private JTextField slotMid;
private JTextField slotRight;

	public FruitSlotPanel(){
		this.setLayout(new FlowLayout());
		slotLeft = new JTextField(5);
		slotMid = new JTextField(5);
		slotRight = new JTextField(5);

		this.add(slotLeft);
		this.add(slotMid);
		this.add(slotRight);
	}
	
	public void updateText(String left, String mid, String, right){
		slotLeft.setText(left);
		slotMid.setText(mid);
		slotRight.setText(right);
	}

}
