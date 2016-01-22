package zadaci_22_01_2016;

import java.util.Scanner;

public class Dan {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese cijeli broj za današnji
		// dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana
		// nakon današnjeg dana te mu ispiše koji je to dan u budućnosti.
		// (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u
		// budućnosti program mu ispisuje da je danas utorak a dan u budućnosti
		// je petak.)

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj za danasnji dan u sedmici,nula je za ponedjeljak");
		int danasnji = input.nextInt();// smjestimo broj za danasnji dan
		System.out.println("Unesite broj dana nakon danasnjeg dana:");
		int buduci = input.nextInt();// smjestimo broj za koliko dana trazimo
										// koji ce bit dan
		// napravimo niz stringova sa imenima dana u sedmici
		String[] dani = { "Ponedjeljak", "Utorak", "Srijeda", "Cetvrtak", "Petak", "Subota", "Nedjelja" };
		// dan u buducnosti je broj za danasnji dan plus broj za buduci modul sa
		// sedam jer sedmica ima sedam dana pa opet na nulu se vraca
		int danUBuducnosti = (danasnji + buduci) % 7;
		// a nula nam je za ponedjljak i ispisujemo koji broj dobijmo za
		// danBuducnosti na tom indeksu dan u nizu dani
		System.out.println("Danasnji dan je " + dani[danasnji]);
		System.out.println("A dan u buducnosti je " + dani[danUBuducnosti]);
		input.close();

	}

}
