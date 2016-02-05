package zadaci_05_02_2016;

import java.util.Scanner;

public class InterestingPoint {

	public static void main(String[] args) {
		// (Geometry: intersecting point) Suppose two line segments intersect.
		// The two endpoints for the first line segment are (x1, y1) and (x2,
		// y2) and for the second line segment are (x3, y3) and (x4, y4).
		// Write a program that prompts the user to enter
		// these four endpoints and displays the intersecting point. As
		// discussed in Programming Exercise 3.25, the intersecting point can be
		// found by solving a linear equation. Use the LinearEquation class in
		// Programming Exercise 9.11 to solve this
		// equation.

		// skener za unos vrijednosti za tacke
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vase tacke (x1,y1) i (x2,y2) za prvu liniju");
		// smjestamo korisnikov unos
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		// ispis
		System.out.println("Unesite vase tacke (x3,yx) i (x4,y4) za drugu liniju");
		// smjestamo unos za drugu liniju
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		// zatvaramo skener
		input.close();
		// sada od unesenih tacaka dobijamo a,b,c,d,e,f da bi mogli koristiti
		// konstruktor i metode iz prethodnog zadatka

		// The intersecting point of the two lines can be found by solving the
		// following
		// linear equation:
		// (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
		// (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		// konstruktorom pravimo objekat rez
		LinearEquation rez = new LinearEquation(a, b, c, d, e, f);
		// ako je ispunjen uslov koji dobijamo kad nad objektom rez pozivamo
		// metodu isSolvable()
		if (rez.isSolvable()) {
			// ispis
			System.out.println("Trazene tacke su : " + rez.getX() + " i " + rez.getY());
		} else
			// ispis
			System.out.println("Dvije linije su paralelne");
	}

}
