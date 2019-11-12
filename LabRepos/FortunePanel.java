import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class FortunePanel extends JPanel {
private JButton button1;
private JTextField text;

	public FortunePanel(ActionListener parent) {
		this.setLayout(new FlowLayout());
		button1 = new JButton("Tell me my fortune!");
		text = new JTextField(20);
		button1.addActionListener(parent);

		this.add(button1);
		this.add(text);
	}
	
	public void updateText(String s){
		text.setText(s);
	}

}
