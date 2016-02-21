package zadaci_19_02_2016;

public class Rectangle extends GeometricObject {
	// (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3
	// to
	// extend GeometricObject and implement the Comparable interface. Override
	// the equals method in the Object class. Two Rectangle objects are equal
	// if their areas are the same. Draw the UML diagram that involves
	// Rectangle,
	// GeometricObject, and Comparable.

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	// geteri i seteri
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// metoda za povrsinu
	public double getArea() {
		return width * height;
	}

	// metoda za obim
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// metoda koja poredi dvije povrsine od pravougaonika
	// dva pravougaonika su jednaka ako su im jednake povrsine
	public boolean equals(Object r1) {
		if (this.getArea() == ((GeometricObject) r1).getArea())
			return true;
		return false;
	}
}
