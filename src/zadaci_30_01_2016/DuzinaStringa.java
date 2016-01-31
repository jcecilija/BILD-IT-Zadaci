package zadaci_30_01_2016;

import java.util.Scanner;

public class DuzinaStringa {

	public static void main(java.lang.String[] args) {
		// Napisati program koji pita korisnika da unese neki string te mu
		// ispisuje dužinu tog stringa kao i prvo slovo stringa.

		// skaner za ucitati rijec
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki string");
		// smjetamo rijec
		String tekst = input.next();
		// ispis sto se trazi, duzina se dobije sa .length() a prvo slovo je na
		// indeksu[0]
		System.out.println("Duzina stringa je " + tekst.length() + " a prvo slovo stringa je " + tekst.charAt(0));
		input.close();
	}
}
