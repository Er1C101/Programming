import java.awt.Color;
import javax.swing.JFrame;

public class snake {

	public static void main(String[] args) {
		
		// JFrame
		JFrame obj = new JFrame("Snake");
		gameplay Gameplay = new gameplay();	
		obj.setBounds(10, 10, 905, 700);
		obj.setBackground(Color.DARK_GRAY);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(Gameplay);
		obj.setVisible(true);
		
	}
}
