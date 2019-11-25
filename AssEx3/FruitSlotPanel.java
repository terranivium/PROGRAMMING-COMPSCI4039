// 2460681S, Wesley Scott

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Dimension;

// Card Slot panel
public class FruitSlotPanel extends JPanel{
// Card slots
private JLabel slotLeft; 
private JLabel slotMid;
private JLabel slotRight;

	public FruitSlotPanel(){
		// Set layout manager for cards slots
		this.setLayout(new FlowLayout());

		// Create card slots (JLabels)
		slotLeft = new JLabel();
		slotMid = new JLabel();
		slotRight = new JLabel();

		// Define and add border to each card slot
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		slotLeft.setBorder(border);
		slotMid.setBorder(border);
		slotRight.setBorder(border);

		// Specifies exact size for card slots
		slotLeft.setPreferredSize(new Dimension(55, 90));
		slotMid.setPreferredSize(new Dimension(55, 90));
		slotRight.setPreferredSize(new Dimension(55, 90));

		// Set horizontal alignment of each card slot
		slotLeft.setHorizontalAlignment(JLabel.CENTER);
		slotMid.setHorizontalAlignment(JLabel.CENTER);
		slotRight.setHorizontalAlignment(JLabel.CENTER);
						
		// Forces JLabel to draw		
		slotLeft.setOpaque(true);
		slotMid.setOpaque(true);
		slotRight.setOpaque(true);

		// Set card slot background colour
		slotLeft.setBackground(Color.YELLOW);
		slotMid.setBackground(Color.YELLOW);
		slotRight.setBackground(Color.YELLOW);

		// Add card slot JLabels to JPanel
		this.add(slotLeft);
		this.add(slotMid);
		this.add(slotRight);
	}
	
	public void updateText(String[] cards){
		// Card slot display text
		slotLeft.setText("<html><u><b>" + cards[0] +"</b></u></html>");
		slotMid.setText("<html><u><b>" + cards[1] +"</b></u></html>");
		slotRight.setText("<html><u><b>" + cards[2] +"</b></u></html>");
	}

}
