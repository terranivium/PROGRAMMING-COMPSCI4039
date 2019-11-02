import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class SwingEx1 extends JFrame{  
	private JLabel north, east, south, west, center;
	private JPanel northPanel, eastPanel, southPanel, westPanel, centerPanel;


	public SwingEx1(){


    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(400,400);
    	setLocation(100,100);
    	setTitle("Border layout for JFrame");

    	Font f = new Font("TimesRoman", Font.PLAIN, 24); 
    	Border blackline = BorderFactory.createLineBorder(Color.black);

    	northPanel = new JPanel();
    	eastPanel = new JPanel();
    	southPanel = new JPanel();
    	westPanel = new JPanel();
    	centerPanel = new JPanel();

    	north = new JLabel("north");
    	east = new JLabel("<html> &nbsp E &nbsp <br> &nbsp A "
		+ "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
    	south = new JLabel("south");
    	west = new JLabel("<html> &nbsp W &nbsp <br> &nbsp E "
		+ "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
    	center = new JLabel("center");

    	north.setFont(f);
    	east.setFont(f);
    	south.setFont(f);
    	west.setFont(f);
    	center.setFont(f);

    	this.setLayout(new BorderLayout());
    	eastPanel.setLayout(new GridBagLayout());
    	centerPanel.setLayout(new GridBagLayout());
    	westPanel.setLayout(new GridBagLayout());

    	northPanel.setBorder(blackline); 
    	eastPanel.setBorder(blackline); 
    	southPanel.setBorder(blackline); 
    	westPanel.setBorder(blackline); 
    	centerPanel.setBorder(blackline); 

    	this.add(northPanel, BorderLayout.NORTH);
    	this.add(eastPanel, BorderLayout.EAST);
    	this.add(southPanel, BorderLayout.SOUTH);
    	this.add(westPanel, BorderLayout.WEST);
    	this.add(centerPanel, BorderLayout.CENTER);

    	northPanel.add(north);
    	eastPanel.add(east);
    	southPanel.add(south);
    	westPanel.add(west);
    	centerPanel.add(center);


   }

   
	public static void main(String [] args){
    	SwingEx1 frame = new SwingEx1();
    	frame.setVisible(true);
   }
}
