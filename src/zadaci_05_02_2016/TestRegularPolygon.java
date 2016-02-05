package zadaci_05_02_2016;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// Draw the UML diagram for the class and then implement the class.
		// Write a test
		// program that creates three RegularPolygon objects, created using the
		// no-arg
		// constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
		// 4, 5.6, 7.8). For each object, display its perimeter and area.

		// pravimo jedan mnogougao po defaultu sa praznim konstruktorom
		RegularPolygon a = new RegularPolygon();
		// ispis njegovog obima i povrsine
		System.out.println(a.getPerimeter() + " je obim a povrsina je : " + a.getArea());
		// pravimo mnogougao b sa 6 strana i duzinom 4 svake strane
		RegularPolygon b = new RegularPolygon(6, 4);
		// ispis b obima i povrsine
		System.out.println(b.getPerimeter() + " je obim a povrsina je : " + b.getArea());
		// sa trecim konstruktorom pravimo c mnogougao sa koordinatama
		RegularPolygon c = new RegularPolygon(10, 4, 5.6, 7.8);
		// ispis za c objekat
		System.out.println(c.getPerimeter() + " je obim a povrsina je : " + c.getArea());
	}

}
