// 2460681S, Wesley Scott

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

// Card slot panel
public class FruitSlotPanel extends JPanel{

private JLabel slotLeft; 
private JLabel slotMid;
private JLabel slotRight;

	public FruitSlotPanel(){
		// Set layout manager for cards slots JPanel
		this.setLayout(new FlowLayout());

		// Create card slots (JLabels)
		slotLeft = new JLabel();
		slotMid = new JLabel();
		slotRight = new JLabel();

		// Define and add border to each card slot
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		slotLeft.setBorder(border);
		slotMid.setBorder(border);
		slotRight.setBorder(border);

		// Specifies exact size for card slot drawing
		slotLeft.setPreferredSize(new Dimension(55, 90));
		slotMid.setPreferredSize(new Dimension(55, 90));
		slotRight.setPreferredSize(new Dimension(55, 90));

		// Set horizontal alignment of each card slot
		slotLeft.setHorizontalAlignment(JLabel.CENTER);
		slotMid.setHorizontalAlignment(JLabel.CENTER);
		slotRight.setHorizontalAlignment(JLabel.CENTER);
						
		// Forces JLabel to draw (for formatting)		
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
	
	// Update card slot display text
	public void updateText(String[] cards){
		slotLeft.setText(cards[0]);
		slotMid.setText(cards[1]);
		slotRight.setText(cards[2]);
	}
}
