package zadaci_19_02_2016;

public abstract class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// konstruktor
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// konstruktor sa specificnim elementima
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// vraca boju koja je
	public String getColor() {
		return color;
	}

	// podesava boju
	public void setColor(String color) {
		this.color = color;
	}

	// da li je objekat popunjen
	public boolean isFilled() {
		return filled;
	}

	// podesava popunjen
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// vraca datum kreiranja
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	// abstraktna metoda za povrsinu
	public abstract double getArea();

	// abstraktan metoda za obim
	public abstract double getPerimeter();
}
