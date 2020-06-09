package solution1;
import java.awt.Graphics;

import javax.swing.JFrame;



public class TestSin extends JFrame {

	public TestSin()
	{
		setSize(800,500);
	}
	
	public static void main(String[] args) {
		DrawSinusWave d=new DrawSinusWave();
		d.setX0(80);
		d.setX1(400);
		d.setK(8);
		d.setAmplitude(40);
		TestSin frame = new TestSin();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().add(d);
		


	}

}
