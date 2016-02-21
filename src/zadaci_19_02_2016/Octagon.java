package zadaci_19_02_2016;

public class Octagon extends GeometricObject {

	// (The Octagon class) Write a class named Octagon that extends
	// GeometricObject and implements the Comparable and Cloneable interfaces.
	// Assume that all eight sides of the octagon are of equal length. The area
	// can
	// be computed using the following formula:
	// area = (2 + 4/22)* side * side
	
	double side;

	public Octagon(double side) {
		this.side = side;
	}

	// geter metoda koja nam daje povrsinu po formuli
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	// geter metoda za obim a to je strana puta osam
	public double getPerimeter() {
		return side * 8;
	}

	// metoda koja uporedjujem dva objekta po povrsini
	public int compareTo(Octagon oct) {
		if (this.getArea() > oct.getArea())
			return 1;
		else if (this.getArea() == oct.getArea())
			return 0;
		else
			return -1;
	}

	// metoda koja klonira objekat, tj vraca kloniran
	public Octagon kloniraj() {
		Octagon kloniran = new Octagon(this.side);
		return kloniran;
	}

}
