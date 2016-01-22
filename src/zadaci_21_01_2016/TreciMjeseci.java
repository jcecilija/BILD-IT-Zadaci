package zadaci_21_01_2016;

import java.util.Scanner;

public class TreciMjeseci {

	public static void IspisKolikoDana(String ime, int godina) {
		// uslov ako uneseni string za mjesec = jan
		if (ime.equals("Jan")) {
			System.out.println("Jan " + godina + " ima 31 dan");
		}
		// uslov
		if ((ime.equals("Feb")) && (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0))) {
			System.out.println("Feb " + godina + " ima 29 dana");
		}
		// Ako godina nije prestupna februar ima 28 dana
		if (ime.equals("Feb") && (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) == false) {
			System.out.println("Feb " + godina + " ima 28 dana");
		}
		// uslovi
		if (ime.equals("Mar")) {
			System.out.println("Mar " + godina + " ima 31 dan");
		}
		if (ime.equals("Apr")) {
			System.out.println("Apr " + godina + " ima 30 dana");
		}
		if (ime.equals("May")) {
			System.out.println("May " + godina + " ima 31 dan");
		}
		if (ime.equals("Jun")) {
			System.out.println("Jun " + godina + " ima 30 dana");
		}
		if (ime.equals("Jul")) {
			System.out.println("Jul " + godina + " ima 31 dan");
		}
		if (ime.equals("Aug")) {
			System.out.println("Aug " + godina + " ima 31 dana");
		}
		if (ime.equals("Set")) {
			System.out.println("Set " + godina + " ima 30 dana");
		}
		if (ime.equals("Oct")) {
			System.out.println("Oct " + godina + " ima 31 dan");
		}
		if (ime.equals("Nov")) {
			System.out.println("Nov " + godina + " ima 30 dana");
		}
		if (ime.equals("Dec")) {
			System.out.println("Dec " + godina + " ima 31 dan");
		}
	}

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese godinu i prva tri
		// slova imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u
		// tom mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao
		// mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite godinu:");
		int godina = input.nextInt();
		System.out.println("Unesite prva tri slova imena mjeseca na eng a prvo slovo Veliko");
		String ime = input.next();
		IspisKolikoDana(ime, godina);
		input.close();
	}
}
