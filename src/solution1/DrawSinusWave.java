package solution1;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawSinusWave extends JPanel {

	private Graphics2D wave2d;
	private int x0,x1,k,amplitude;

	



	//Funkcja daj¹ca wartoœæ sinus-a w x
	double f(double x) {
        return Math.sin(x*3.14159/180);
    }
	
	

	//Funkcja rysuj¹ca fale sinusoidaln¹
	public void paint(Graphics g)
	{
		super.paint(g);
		int pom=getX0();
		int k1=getK();
		int end=getX1();
		int dy=250;
		int amp=getAmplitude();
		
		while (pom<end)
		{

			g.drawLine(pom, (int)(amp*f(pom*k))+dy, pom+1, (int)(amp*f(k*(pom+1)))+dy);
			pom=pom+1;
		}		
	}

	
	public int getX0() {
		return x0;
	}

	public void setX0(int x0) {
		this.x0 = x0;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	public int getAmplitude() {
		return amplitude;
	}



	public void setAmplitude(int amplitude) {
		this.amplitude = amplitude;
	}

}
