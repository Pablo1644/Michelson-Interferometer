import java.util.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class DrawablePanel extends JPanel {
	static int centerX = 300, centerY = 200;
	static int width = 400, height = 300;
	private SineDraw sD = new SineDraw();
	private int ifListener = 0;
	// Miejsce na MouseListenera-MousePressed,Realeased

	public void paint(Graphics polygon) {
		super.paintComponent(polygon);
		height = this.getHeight();
		width = this.getWidth();
		centerX = width / 2;
		centerY = height / 2;
		ifListener = 0;

		Graphics2D polygon2d = (Graphics2D) polygon;

		// Ustawienie grubosci linii
		polygon2d.setStroke(new BasicStroke(1));

		// Ustawienie koloru elementow konstrukcyjnych
		polygon2d.setColor(Color.BLACK);

		// Linia Odniesienia
		polygon2d.drawLine(centerX + 2 * width / 5, centerY - height / 6, centerX + 2 * width / 5,
				centerY + height / 6);

		// Ruchome Lustro
		if (ifListener == 0) {
			polygon2d.drawLine(centerX - width / 8, centerY - 2 * height / 5, centerX + width / 8,
					centerY - 2 * height / 5);
		} else {
			System.out.println("2 przypadek");
		}

		// Zrodlo swiatla
		polygon2d.setColor(Color.RED);
		polygon2d.fillRect(0, centerY - height / 4, width / 16, height / 2);

		// Soczewka przy zrodle
		polygon2d.setColor(Color.BLACK);
		polygon2d.drawRect(centerX - width / 8, centerY - height / 2, width / 4, centerY - height / 2);

		// Detektor
		polygon2d.setColor(Color.ORANGE);
		polygon2d.fillRect(centerX - width / 8, height - height / 8, width / 4, height / 8);

		// Soczewka przy detektorze
		polygon2d.setColor(Color.BLACK);
		polygon2d.setStroke(new BasicStroke(2.0f));
		polygon2d.drawLine(centerX - width / 40, height - height / 6, centerX + width / 40, height - height / 6);

		// Rysowanie zwierciadla,przez ktore przechodzi fala
		polygon2d.drawLine(width / 14, centerY + height / 30, width / 14, centerY - height / 30);
		polygon2d.drawLine(centerX - width / 8, centerY - height / 8, centerX + width / 8, centerY + height / 8);

		// Rysowanie fal sinusoidalnych
		sD.horizontalDraw(polygon2d, new Point2D.Double(width / 16, centerY - 25),
				new Point2D.Double(centerX - 8, centerY - 25), 50, 4, Color.black);
		sD.horizontalDraw(polygon2d, new Point2D.Double(centerX - 8, centerY - 15),
				new Point2D.Double(centerX + 2 * width / 5, centerY - 12.5), 25, 4, Color.black);
		sD.reverseHorizontalDraw(polygon2d, new Point2D.Double(centerX + 2 * width / 5, centerY),
				new Point2D.Double(centerX - 8, centerY), 25, 4, Color.red);

		sD.verticalDraw(polygon2d, new Point2D.Double(centerX - 22, centerY - 2 * height / 5 + 2),
				new Point2D.Double(centerX - 22, centerY - 8), 25, 4, Color.red);
	}

}