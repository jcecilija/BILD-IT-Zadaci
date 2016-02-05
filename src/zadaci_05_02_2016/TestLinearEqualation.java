package zadaci_05_02_2016;

import java.util.Scanner;

public class TestLinearEqualation {

	public static void main(String[] args) {
		// Draw the UML diagram for the class and then implement the class.
		// Write a test
		// program that prompts the user to enter a, b, c, d, e, and f and
		// displays the result.
		// If ad - bc is 0, report that “The equation has no solution

		// skener za unos varijabli
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrijednosti za a,b,c,d,e,f");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		// pravimo objekat nest sa konstruktorom kome prosljedjujemo varijable
		LinearEquation nest = new LinearEquation(a, b, c, d, e, f);
		// uslov
		if (nest.isSolvable() == false) {
			// ispis
			System.out.println("The equation has no solution!");
		} else {
			// ispis
			System.out.println("x = " + nest.getX() + " y = " + nest.getY());
		}
		// zatvaramo skener
		input.close();
	}
}