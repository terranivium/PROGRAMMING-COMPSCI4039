import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FortuneTeller extends JFrame implements ActionListener{

private FortunePanel mainPanel;
private String[] fortuneText;

	public FortuneTeller() {
		setSize(300,300);
		setLocation(20,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fortuneText  = new String[15];
		mainPanel = new FortunePanel(this);
		add(mainPanel);

		FileReader fr = null;
		try {
			String fortunesFile = "/Users/tnivium/Desktop/PROGRAMMING-COMPSCI4039/LabRepos/fortunes.txt";
			fr = new FileReader(fortunesFile);
			Scanner fortuneReader = new Scanner(fr);
			int i = 0;
			while(fortuneReader.hasNextLine()){
				fortuneText[i] = fortuneReader.nextLine();
				i++;
			}
		}catch(FileNotFoundException e){
			System.out.println("No such file exists...");
		}finally{
			try{
				fr.close();
			}catch(IOException e){
				System.out.println("Cannot close file, does not exist...");
			}
		}
	}

	public void actionPerformed(ActionEvent e){
		Random r = new Random();
		mainPanel.updateText(fortuneText[r.nextInt(15)]);
		System.out.println(r.nextInt(15));
	}

	public static void main(String[] args) {
		FortuneTeller gui =  new FortuneTeller();
		gui.setVisible(true);

	}

	
	

}
