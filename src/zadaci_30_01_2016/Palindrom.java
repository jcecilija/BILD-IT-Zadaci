package zadaci_30_01_2016;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese cijeli trocifreni broj
		// te provjerava da li je unijeti broj palindrom. Broj je palindrom
		// ukoliko se čita isto i sa lijeva na desno i sa desna na lijevo npr.
		// 121, 131, itd.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite cijeli trocifreni broj:");
		// smjestamo broj
		int broj = input.nextInt();
		// krajnji broj trocifrenog broja dobijemo sa modulom 10
		int krajnji = broj % 10;
		// prvi broj trocifrenog broja dobijemo kada broj podijelimo sa 100
		int prvi = broj / 100;
		// uslov ako je prvi jednak krajnjem onda je broj palindrom
		if (krajnji == prvi) {
			System.out.println("Broj je palindrom");
		} else {
			System.out.println("Broj nije palindrom");
		}
		input.close();
	}
}