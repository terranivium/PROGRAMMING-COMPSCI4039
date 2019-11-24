import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Dimension;

public class FruitSlotPanel extends JPanel{
private JLabel slotLeft;
private JLabel slotMid;
private JLabel slotRight;

	public FruitSlotPanel(){
		this.setLayout(new FlowLayout());

		slotLeft = new JLabel();
		slotMid = new JLabel();
		slotRight = new JLabel();

		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

		slotLeft.setBorder(border);
		slotMid.setBorder(border);
		slotRight.setBorder(border);

		slotLeft.setPreferredSize(new Dimension(55, 90));
		slotMid.setPreferredSize(new Dimension(55, 90));
		slotRight.setPreferredSize(new Dimension(55, 90));

		slotLeft.setHorizontalAlignment(JLabel.CENTER);
		slotMid.setHorizontalAlignment(JLabel.CENTER);
		slotRight.setHorizontalAlignment(JLabel.CENTER);
								
		slotLeft.setOpaque(true);
		slotMid.setOpaque(true);
		slotRight.setOpaque(true);

		slotLeft.setBackground(Color.YELLOW);
		slotMid.setBackground(Color.YELLOW);
		slotRight.setBackground(Color.YELLOW);

		this.add(slotLeft);
		this.add(slotMid);
		this.add(slotRight);
	}
	
	public void updateText(String[] cards){
		slotLeft.setText("<html><u>" + cards[0] +"</u></html>");
		slotMid.setText("<html><u>" + cards[1] +"</u></html>");
		slotRight.setText("<html><u>" + cards[2] +"</u></html>");
	}

}
