package zadaci_05_02_2016;

public class LinearEquation {
	// Design a class named LinearEquation for a
	// 2 * 2 system of linear equations:
	// The class contains:
	// ■ Private data fields a, b, c, d, e, and f.
	// ■ A constructor with the arguments for a, b, c, d, e, and f.
	// ■ Six getter methods for a, b, c, d, e, and f.
	// ■ A method named isSolvable() that returns true if ad - bc is not 0.
	// ■ Methods getX() and getY() that return the solution for the equation
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// pravimo kontruktor za sve argumente
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// geteri za sve
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// boolean metoda
	public boolean isSolvable() {
		// uslov
		if ((a * d - b * c) != 0) {
			// vraca true ako je uslov ispunjen
			return true;
		} else
			// ako nije uslov ispunjen vraca false
			return false;
	}

	// metoda koja vraca vrijednost x
	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));

	}

	// metoda koja vraca vrijednost y
	public double getY() {
		return ((a * f) - (e * c) / (a * d) - (b * c));
	}
}
