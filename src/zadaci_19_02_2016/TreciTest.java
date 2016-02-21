package zadaci_19_02_2016;

public class TreciTest {

	public static void main(String[] args) {
		// // Draw the UML diagram that involves Octagon, GeometricObject,
		// Comparable, and Cloneable. Write a test program that creates an
		// Octagon
		// object with side value 5 and displays its area and perimeter. Create
		// a
		// new object
		// using the clone method and compare the two objects using the
		// compareTo
		// method.

		// kreiramo objekat o pozovemo i ispisemo rezultat trazenih metoda
		Octagon o = new Octagon(5);
		System.out.println("Povrsina ovog objekta je:" + o.getArea());
		System.out.println("Obim ovog objekta je:" + o.getPerimeter());
		Octagon kloniran = o.kloniraj();
		int rezultat = kloniran.compareTo(o);
		if (rezultat > 0) {
			System.out.println("Veci je kloniran objekat");
		} else if (rezultat < 0) {
			System.out.println("veci je objekat o");
		} else
			System.out.println("Ova dva objekta su jednaka");

	}

}
