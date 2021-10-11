
public class ShapesClient {

	public static void main(String[] args) {
		Circle c1 = new Circle("yellow"); // (15, 5) ; 290
		Circle c2 = new Circle("black");
		Circle c3 = new Circle("black");
		Circle c4 = new Circle("black");
		Circle c5 = new Circle("yellow");
		Rect r1 = new Rect();
		// default circle: (20, 30, 60, "blue")
		// default rectangle: (40, 30, 70, 90, "yellow")
		c1.slowMoveVertical(-55);
		c1.slowMoveHorizontal(-15);
		c1.changeSize(290);
		c2.slowMoveHorizontal(40);
		c2.slowMoveVertical(15);
		c2.changeSize(35);
		
	}

}
