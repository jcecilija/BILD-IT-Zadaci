package zadaci_10_02_2016;

public class GeometricObject {

	// data filds
	private String color = "white";
	private boolean filled;

	// prazan konstruktor
	public GeometricObject() {

	}

	// kontruktor sa data filds
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// geter
	public String getColor() {
		return color;
	}

	// seter
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		return "je popunje : " + isFilled() + " a boja je : " + getColor();
	}

}
