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

	private JLabel slotLeft; // Holds left card
	private JLabel slotMid; // Holds middle card
	private JLabel slotRight; // Holds right card

	public FruitSlotPanel(){
		// Set layout manager for card slots JPanel
		this.setLayout(new FlowLayout());

		// Create card slots (JLabels)
		this.slotLeft = new JLabel();
		this.slotMid = new JLabel();
		this.slotRight = new JLabel();

		// Define and add border to each card slot
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		this.slotLeft.setBorder(border);
		this.slotMid.setBorder(border);
		this.slotRight.setBorder(border);

		// Specifies exact size for card slot drawing
		this.slotLeft.setPreferredSize(new Dimension(55, 90));
		this.slotMid.setPreferredSize(new Dimension(55, 90));
		this.slotRight.setPreferredSize(new Dimension(55, 90));

		// Set horizontal alignment of each card slot
		this.slotLeft.setHorizontalAlignment(JLabel.CENTER);
		this.slotMid.setHorizontalAlignment(JLabel.CENTER);
		this.slotRight.setHorizontalAlignment(JLabel.CENTER);
						
		// Forces JLabel to draw (for formatting)		
		this.slotLeft.setOpaque(true);
		this.slotMid.setOpaque(true);
		this.slotRight.setOpaque(true);

		// Set card slot background colour
		this.slotLeft.setBackground(Color.YELLOW);
		this.slotMid.setBackground(Color.YELLOW);
		this.slotRight.setBackground(Color.YELLOW);

		// Add card slot JLabels to JPanel
		this.add(slotLeft);
		this.add(slotMid);
		this.add(slotRight);
	}

	public JLabel getSlotLeft() {
		return this.slotLeft;
	}

	public void setSlotLeft(JLabel slotLeft) {
		this.slotLeft = slotLeft;
	}

	public JLabel getSlotMid() {
		return this.slotMid;
	}

	public void setSlotMid(JLabel slotMid) {
		this.slotMid = slotMid;
	}

	public JLabel getSlotRight() {
		return this.slotRight;
	}

	public void setSlotRight(JLabel slotRight) {
		this.slotRight = slotRight;
	}

	// Update card slot display text
	public void updateText(String[] cards){
		this.slotLeft.setText(cards[0]);
		this.slotMid.setText(cards[1]);
		this.slotRight.setText(cards[2]);
	}
}