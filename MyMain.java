package beaty;

public class MyMain {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.requestFocus();
		
		Ball ball = new Ball(100, 100);
		canvas.addGameObject(ball);
		
		for(int row = 1; row <= 15; row++) {
			for(int col = 1; col<= 10; col++) {
				canvas.addGameObject(new Ball(row*60, col*60));
			}
		}
	}

}
