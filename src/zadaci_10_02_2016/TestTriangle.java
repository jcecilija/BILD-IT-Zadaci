package zadaci_10_02_2016;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// Draw the UML diagrams for the classes Triangle and GeometricObject
		// and
		// implement the classes. Write a test program that prompts the user to
		// enter three
		// sides of the triangle, a color, and a Boolean value to indicate
		// whether
		// the triangle
		// is filled. The program should create a Triangle object with these
		// sides
		// and set
		// the color and filled properties using the input. The program should
		// display
		// the area, perimeter, color, and true or false to indicate whether it
		// is
		// filled or not.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite strane trokuta a , b i c");
		// uzimamo od korisnika stranice trokuta
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// ispis
		System.out.println("Unesite boju:");
		// uzimamo moju
		String boja = input.nextLine();
		// ispis
		System.out.println("Da li je popunjen trokut: unesite true ili false");
		// uzimmao boolean vrijednost od korisnika
		boolean popunjen = input.hasNextBoolean();
		// zatvaramo skener
		input.close();
		// kreiramo objekat trokut
		Triangle trokut = new Triangle(a, b, c, boja, popunjen);
		// ispis i poziv metoda nad objektotom
		System.out.println("Povrsina trokuta je : " + trokut.getArea());
		System.out.println("Obim trokuta je : " + trokut.getPerimeter());
		System.out.println("Boja trokuta je : " + trokut.getColor());
		System.out.println("Da li je popunjen: " + trokut.isFilled());

	}

}
