package zadaci_05_02_2016;

public class RegularPolygon {

	// (Geometry: n-sided regular polygon) In an n-sided regular polygon, all
	// sides
	// have the same length and all angles have the same degree (i.e., the
	// polygon is both equilateral and equiangular). Design a class named
	// RegularPolygon
	// that contains:
	// ■ A private int data field named n that defines the number of sides in
	// the polygon with default value 3.
	// ■ A private double data field named side that stores the length of the
	// side with
	// default value 1.
	// ■ A private double data field named x that defines the x-coordinate of
	// the polygon’s center with default value 0.
	// ■ A private double data field named y that defines the y-coordinate of
	// the polygon’s center with default value 0.
	// ■ A no-arg constructor that creates a regular polygon with default
	// values.
	// ■ A constructor that creates a regular polygon with the specified number
	// of sides
	// and length of side, centered at (0, 0).
	// ■ A constructor that creates a regular polygon with the specified number
	// of sides,
	// length of side, and x- and y-coordinates.
	// ■ The accessor and mutator methods for all data fields.
	// ■ The method getPerimeter() that returns the perimeter of the polygon.
	// ■ The method getArea() that returns the area of the polygon.
	// postavljamo pocetne vrijednosti kako se trazi u zadatku
	private int n = 3;
	private double side = 1.0;
	private double x = 0;
	private double y = 0;

	// konstruktor bez argumenata
	public RegularPolygon() {

	}

	// konstruktor sa br strana i duzinom
	public RegularPolygon(int brStrana, double duzinaStrane) {
		n = brStrana;
		side = duzinaStrane;
	}

	// treci konstruktor i sa koordinatama
	public RegularPolygon(int brStrana, double duzinaStrane, double x, double y) {
		n = brStrana;
		side = duzinaStrane;
		this.x = x;
		this.y = y;
	}

	// geteri i seteri za sve data fields
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// metoda koja racuna obim a to je broj strana puta duzina strane jer su sve
	// strane iste tako je postavljeno u zadatku
	public double getPerimeter() {
		return n * side;
	}

	// metoda koja vraca povrsinu po formuli u zadatku zadanoj
	public double getArea() {
		return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
	}

}
