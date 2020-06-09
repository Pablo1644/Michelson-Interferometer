package basicSolution;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

import solution2.DrawSinusWave;

import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

	DrawablePanel panelMid;
	
	public MainFrame() {
		setTitle("Interferometr Michelsona");
		setLayout(new BorderLayout());
		setSize(800, 500);

		// Gorny panel
		JPanel panelTop = new JPanel();
		panelTop.setLayout(new FlowLayout());
		this.add(panelTop, BorderLayout.PAGE_START);

		// Lewy panel
		JPanel panelLeft = new JPanel();
		panelLeft.setLayout(new GridLayout(8, 1));
		JButton rullerButton = new JButton("Dodaj linijke");
		rullerButton.setBounds(0, 50, 100, 50);
		panelLeft.add(rullerButton);
		JMenuBar jmb = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem loadMenuItem = new JMenuItem("Pobierz dane z pliku");
		JMenuItem saveMenuItem = new JMenuItem("Zapisz graficzny obraz symulacji");
		setJMenuBar(jmb);
		jmb.add(menu);
		menu.add(loadMenuItem);
		menu.add(saveMenuItem);
		this.add(panelLeft, BorderLayout.LINE_START);

		// Centralny panel
		panelMid = new DrawablePanel();
		panelMid.setLayout(new FlowLayout());
		panelMid.setBackground(Color.pink);
		this.add(panelMid, BorderLayout.CENTER);
		panelMid.setAddedMirrorY(0);

		// Prawy panel
		JPanel panelRight = new JPanel();
		panelRight.setLayout(new GridLayout(8, 1));
		JButton Button7 = new JButton("Wybierz kolor");
		Button7.setBounds(0, 100, 100, 50);
		Button7.addActionListener(new paintComponent(this));
		panelRight.add(Button7);
		JSlider slider = new JSlider(JSlider.VERTICAL, 0, 60, 0);
		slider.setValue(60);
		slider.setMajorTickSpacing(1);
		
		// Akcja suwaka
		ChangeListener setSliderValue = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				int value =75-slider.getValue();
				
				panelMid.setAddedMirrorY(value);
				repaint();
				System.out.println(value);
			}
		};
		slider.addChangeListener(setSliderValue);

		panelRight.add(slider);
		this.add(panelRight, BorderLayout.LINE_END);

		// Dolny panel
		JPanel panelBot = new JPanel();
		panelBot.setLayout(new BorderLayout());
		JButton Button8 = new JButton("ON/OFF");
		panelBot.add(Button8, BorderLayout.LINE_END);
		this.add(panelBot, BorderLayout.PAGE_END);

	}

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public class paintComponent implements ActionListener {
		MainFrame frame;

		public paintComponent(MainFrame frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// bgColor = JColorChooser.showDialog(frame, "Select a color", Color.white);
			// panelMid.repaint();
		}

	}

}