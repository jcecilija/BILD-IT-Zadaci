package zadaci_19_02_2016;

public class Cetvrti {

	// metoda koja sabira povrsine objekata u nizu
	public static double sumArea(GeometricObject[] a) {
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma = suma + a[i].getArea();
		}
		// kao rezultat metoda vraca sumu ukupnu
		return suma;
	}

	public static void main(String[] args) {
		// (Sum the areas of geometric objects) Write a method that sums the
		// areas of all the
		// geometric objects in an array. The method signature is:
		// public static double sumArea(GeometricObject[] a)
		// Redesign the Rectangle class VideoNote
		// Write a test program that creates an array of four objects (two
		// circles and two
		// rectangles) and computes their total area using the sumArea method.

		// kreiramo 4 objekta
		Rectangle r1 = new Rectangle(2, 4);
		Rectangle r2 = new Rectangle(4, 2);
		Circle c1 = new Circle(3.2);
		Circle c2 = new Circle(3.3);
		// kreiramo niz sa tim objektima tj stavimo ih u niz
		GeometricObject[] a = { r1, r2, c1, c2 };
		// ispis i poziv metode
		System.out.println("Ukupna povrsina ova cetiri objekta je: " + sumArea(a));
	}

}
