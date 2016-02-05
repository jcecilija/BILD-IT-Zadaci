package zadaci_05_02_2016;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		// Draw the UML diagram for the class and then implement the class.
		// Write a test
		// program that prompts the user to enter values for a, b, and c and
		// displays the result
		// based on the discriminant. If the discriminant is positive, display
		// the two roots. If
		// the discriminant is 0, display the one root.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite vrijednosti za a , b ,c");
		// smjestanje vrijednosti sto korisnik unese
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// kreiramo objekat jednacina sa new operatorom i konstruktorom
		QuadraticEquation jednacina = new QuadraticEquation(a, b, c);
		// uslov
		if (jednacina.getDiscriminant() > 0) {
			// ispis oba root
			System.out.println(jednacina.getRoot1() + " root1 i " + jednacina.getRoot2() + " root2");
		} // uslov i ispis samo jednog root
		else if (jednacina.getDiscriminant() == 0) {
			System.out.println(jednacina.getRoot1());
		} else
			// ispis
			System.out.println("The equation has no roots");
		// zatvaramo skener
		input.close();
	}
}
