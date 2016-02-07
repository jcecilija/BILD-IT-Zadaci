package zadaci_06_02_2016;

public class MyPoint {

	// Design a class named MyPoint to represent a point with
	// x- and y-coordinates. The class contains:
	// methods.
	private double x;
	private double y;

	// ■ A no-arg constructor that creates a point (0, 0).
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	// ■ The data fields x and y that represent the coordinates with getter
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// ■ A constructor that constructs a point with specified coordinates.
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// ■ A method named distance that returns the distance from this point to a
	// specified point of the MyPoint type.
	// metoda koja vraca rezultat ove formule
	// d = \sqrt{(x_2-x_1)^2 + (y_2-y_1)^2}.
	public double distance(MyPoint a) {
		return Math.sqrt(Math.pow((a.getX() - x), 2)) + Math.pow((a.getY() - y), 2);
	}

	// ■ A method named distance that returns the distance from this point to
	// another point with specified x- and y-coordinates.
	public double distance(double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x), 2)) + Math.pow((y2 - y), 2);
	}
}
