package zadaci_10_02_2016;

public class Triangle extends GeometricObject {
	// Design a class named Triangle that extends
	// GeometricObject. The class contains:
	// ■ Three double data fields named side1, side2, and side3 with default
	// values 1.0 to denote three sides of the triangle.
	// ■ A no-arg constructor that creates a default triangle.
	// ■ A constructor that creates a triangle with the specified side1, side2,
	// and side3.
	// ■ The accessor methods for all three data fields.
	// ■ A method named getArea() that returns the area of this triangle.
	// ■ A method named getPerimeter() that returns the perimeter of this
	// triangle.
	// ■ A method named toString() that returns a string description for the
	// triangle.
	// For the formula to compute the area of a triangle, see Programming
	// Exercise 2.19.
	// The toString() method is implemented as follows:
	// return "Triangle: side1 = " + side1 + " side2 = " + side2 +
	// " side3 = " + side3;

	// data fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// no arg contructor
	public Triangle() {

	}

	// constructor with sides
	Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	// accessors
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// metode
	// s = (side1 + side2 + side3)/2;
	// area = 2s(s - side1)(s - side2)(s - side3)
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return (2 * s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// override metoda to String
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
