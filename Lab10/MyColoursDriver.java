package Lab10;
import javax.swing.JFrame;

public class MyColoursDriver {

	public static void main(String[] args) {

		MyColours changeColour = new MyColours("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(500, 400);
		changeColour.setResizable(false);
		changeColour.setVisible(true);

	}//end main

}//end class