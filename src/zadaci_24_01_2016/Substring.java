package zadaci_24_01_2016;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese dva stringa te
		// provjerava i ispisuje da li je drugi string substring prvog stringa.
		// Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao
		// drugi string program mu ispisuje da je BC substring ABCD stringa

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite dva stringa:");
		// ucitavamo dva stringa
		String prvi = input.next();
		String drugi = input.next();
		// uslov provjeravamo sa metodom contains
		if (prvi.contains(drugi)) {
			// ispis ako je uslov ispunjen
			System.out.println(drugi + " je substring " + prvi);
		} else
			// ispis ako nije
			System.out.println(drugi + " nije substring " + prvi);
		// zatvaramo skener
		input.close();
	}
}
