package zadaci_05_02_2016;

public class QuadraticEquation {

	// Algebra: quadratic equations) Design a class named QuadraticEquation for
	// a quadratic equation ax2 + bx + x = 0. The class contains:

	// ■ Private data fields a, b, and c that represent three coefficients.
	private double a;
	private double b;
	private double c;

	// ■ A constructor for the arguments for a, b, and c.
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// ■ Three getter methods for a, b, and c.
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// ■ A method named getDiscriminant() that returns the discriminant, which
	// is b2 - 4ac.
	public double getDiscriminant() {
		return (Math.pow(b, 2) - (4 * a * c));
	}

	// These methods are useful only if the discriminant is nonnegative. Let
	// these methods return 0 if the discriminant is negative.
	public double getRoot1() {
		if (getDiscriminant() > 0) {
			return ((-b) + (Math.sqrt(Math.pow(b, 2))) - (4 * a * c)) / 2 * a;
		} else {
			return 0;
		}
	}

	// druga metoda koja vraca vrijednosti ako je getRoot veci od nula ili vraca
	// nula ako je negativna vrijednost getRoot formula je definisana u zadatku
	public double getRoot2() {
		if (getDiscriminant() > 0) {
			return ((-b) - (Math.sqrt(Math.pow(b, 2))) - (4 * a * c)) / 2 * a;
		} else {
			return 0;
		}
	}
}
