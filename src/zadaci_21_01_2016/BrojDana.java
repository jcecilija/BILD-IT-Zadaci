package zadaci_21_01_2016;

import java.util.Scanner;

public class BrojDana {

	// Napisati program koji pita korisnika da unese mjesec i godinu te mu
	// ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese
	// kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar
	// 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao
	// mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan

	public static int getBrojDanaUMjesecu(int godina, int mjesec) {
		// metoda koja nam vraca koliko mjesec ima dana
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7 || mjesec == 8 || mjesec == 10 || mjesec == 12)
			return 31;// uslov za 31 dan
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11)
			return 30;// uslov za 30 dana
		if (mjesec == 2)// uslov da li je prestupna
			return isLeapYear(godina) ? 29 : 28;
		return 0;
	}

	public static boolean isLeapYear(int godina) {// metoda koja vraca da li je
													// godina
		// prestupna
		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
	}

	// metoda koja nam ispisujem ime mjeseca
	public static void ime(int mjesec) {
		// napravimo string duzine 13 u koji unesemo sve mjesece tako sto redni
		// broj 1 pripada januaru a 12 decembru
		String[] mjeseci = { "", "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		// ispisemo ime mjeseca na tom rdnom broju stringa
		System.out.println(mjeseci[mjesec]);
	}

	public static void main(String[] args) {
		// skener za unos mjeseca i godine
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesec");
		int mjesec = input.nextInt();
		System.out.println("Unesite godinu");
		int godina = input.nextInt();
		// ispis
		System.out.print("Mjesec  ");
		ime(mjesec);// pozivamo metodu koja nam ispisuje ime mjeseca
		System.out.print("je imao dana " + getBrojDanaUMjesecu(godina, mjesec));// ispis
																					// dana
																					// sa
																					// metodom
		input.close();
	}
}
