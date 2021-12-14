package beaty;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Canvas extends JComponent implements ActionListener{
	//data members: window, game loop, and list of game objects
	private JFrame frame = new JFrame();
	private Timer gameLoopTimer;
	private List <GameObject> gameObjectList;
	
	//constructor
	public Canvas() {
		//task 1: create the list of game objects
		gameObjectList = new LinkedList<GameObject>();
		
		//task 2: create the window(the canvas)
		frame = new JFrame("FinalProject Experiment");
		frame.setSize(700, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		
		//task 3: construct a timer and start it
		gameLoopTimer = new Timer(25, this);
		gameLoopTimer.start();
		
		//task 4: make the window visible
		frame.setVisible(true);
	}
	//method: add game objects
	public synchronized void addGameObject(GameObject gObject) {
		gameObjectList.add(gObject);
	}
	
	//method paint
	public synchronized void paint(Graphics g) {
		for(GameObject gameObject: gameObjectList) {
			gameObject.draw(this, g);
		}
	}
	
	//methods we need
	//canvas must implement the inherited abstract methos
	//ActionListener.actoinPerformed
	public synchronized void actionPerformed(ActionEvent e) {
		//task: loop through all the game objects and display them
		for(GameObject gameObject: gameObjectList) {
			gameObject.move(this);
		}
		repaint();
	}

	
}
