package solution2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import javax.swing.JPanel;

public class DrawSinusWave extends JPanel {
	private SineDraw sD = new SineDraw();
	//Funkcja rysuj¹ca fale sinusoidaln¹
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(new Line2D.Double(0,180,360,180)); //os pozioma
		g2.draw(new Line2D.Double(180,0,180,360)); //os pionowa
		
		//sD.horizontalDraw(g2, new Point2D.Double(0,180),new Point2D.Double(180,180) , 50, 4, Color.black);
		//sD.horizontalDraw(g2, new Point2D.Double(180,180),new Point2D.Double(360,180) , 25, 4, Color.black);
		//sD.reverseHorizontalDraw(g2, new Point2D.Double(360,180),new Point2D.Double(180,180) , 25, 4, Color.black);
		//sD.verticalDraw(g2, new Point2D.Double(180,0),new Point2D.Double(180,180) , 25, 4, Color.red);
		sD.reserveVerticalDraw(g2, new Point2D.Double(180,360),new Point2D.Double(180,180), 25, 8,Color.green);
	}
}
