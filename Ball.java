package beaty;

import javax.swing.ImageIcon;

public class Ball extends GameObject {
	//data members
	private int imageWidth;
	
	//constructor
	public Ball(int x, int y) {
		super(x, y);
		setVelocity(3);
		myImage = new ImageIcon("Images/ballRed.png");
		imageWidth = myImage.getIconWidth();
	}
	
	//implement abstract method mve
	public void move(Canvas c) {
		//move the ball and check for collision
		if(getDirection() == Direction.LEFT) {
			setX(getX() + getVelocity());
			if(getX() + imageWidth > c.getSize().getWidth()) {
				setX((int)(c.getSize().getWidth()-imageWidth));
				setDirection(Direction.RIGHT);
			}			
		}
		else if(getDirection() == Direction.RIGHT) {
			setX(getX() + getVelocity());
			if(getX() < 0) {
				setX(0);
				setDirection(Direction.LEFT);
			}
	}
}
}
