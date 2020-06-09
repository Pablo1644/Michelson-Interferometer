package solution2;
import java.awt.Graphics;

import javax.swing.JFrame;



public class TestSin extends JFrame {

	public TestSin()
	{
		setSize(400,400);
	}
	
	public static void main(String[] args) {
		DrawSinusWave d=new DrawSinusWave();
		TestSin frame = new TestSin();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().add(d);
		


	}

}
