package zadaci_19_02_2016;

public class Circle extends GeometricObject {
	// (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to
	// extend
	// GeometricObject and implement the Comparable interface. Override the
	// equals method in the Object class. Two Circle objects are equal if their
	// radii
	// are the same. Draw the UML diagram that involves Circle, GeometricObject,
	// and Comparable.

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// dobijanje radijusa
	public double getRadius() {
		return radius;
	}

	// postavljanje radijusa
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// metoda koja vraca povrsinu
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// metoda koja vraca diametar
	public double getDiameter() {
		return 2 * radius;
	}

	// metoda koja vraca obim
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// stampa info o krugu
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

	// ako je radiujus od dva kruga isti onda su ta dva kruga ista
	public boolean equals(Object c1) {
		if (this.getRadius() == ((Circle) c1).getRadius())
			return true;
		return false;
	}
}
