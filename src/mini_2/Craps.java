package mini_2;

public class Craps {

	// metoda koja nam simulira bacanje dvije kockice i ispisuje brojeve kockica
	// i sumu i vraca nam sumu
	public static int bacanje() {
		int jedna = 1 + (int) (Math.random() * 6);
		int druga = 1 + (int) (Math.random() * 6);
		int suma = jedna + druga;
		System.out.println("Bacili ste: " + jedna + " + " + druga + " = " + suma);
		return suma;
	}
	 
	// metoda koja prima point i sumu
	public static void point(int point, int suma) {
		// point je prva suma point koju smo dobili i on se ne mijenja
		point = suma;
		// ispis
		System.out.println("Point je " + point);
		// druga suma je ono sto nam vrati metoda koja simulira bacanje
		int suma2 = bacanje();
		// uslov za pobjedu
		if (suma2 == point) {
			// ispis
			System.out.println("Pobijedili ste");
		} // uslov za izgubit
		else if (suma2 == 7) {
			System.out.println("Izgubili ste");
		} // ako nije ispunjen ni jedan gore uslov pozivamo metodu PonovoPoint
		else if (suma2 != point && suma2 != 7) {
			PonovoPoint(point);
		}
	}

	// metoda koja ponovo baca i provjerava zbir dok ne bude point jednak prvom
	// pointu
	public static void PonovoPoint(int point) {
		// simuliramo ponovo bacanje
		int jedna = 1 + (int) (Math.random() * 6);
		int druga = 1 + (int) (Math.random() * 6);
		// dobijamo novu sumu bacenih kockica
		int newSuma = jedna + druga;
		// ispis
		System.out.println("Bacili ste: " + jedna + " + " + druga + " = " + newSuma);
		// uslov ako suma nije ni point ni 7
		if (newSuma != point && newSuma != 7) {
			System.out.println("Point je i dalje " + point);
			// ponovo poziv metoda koja baca sve dok ne bude ili point ili 7
			PonovoPoint(point);
		} // uslov ako je suma 7 gubi se
		else if (newSuma == 7) {
			System.out.println("Izgubili ste");
		}
		// uslov da metoda vrti se dok ne bude ili pobjeda ili poraz
		while (newSuma != point)
			;
		System.out.println("Pobijedili ste");
	}

	// metoda koja provjerava prvo bacanje
	public static void provjera(int suma) {
		// If the sum is 2, 3, or 12 (called craps), you lose;
		if (suma == 2 || suma == 3 || suma == 12) {
			System.out.println("Izgubili ste!");
		}
		// if the sum is 7 or 11 (called natural), you win
		if (suma == 7 || suma == 11) {
			System.out.println("Pobijedili ste!");
		} // Continue to roll the dice until either
			// a 7 or the same point value is rolled. If 7 is rolled, you lose.
			// Otherwise, you win.
		if (suma == 4 || suma == 5 || suma == 6 || suma == 8 || suma == 9 || suma == 10) {
			point(suma, suma);
		}
	}
}