package zadaci_27_01_2016;

import java.util.Scanner;

public class Napojnica {

	public static void main(String[] args) {
		// (Izračunavanje napojnice) Napisati program koji učitava ukupan iznos
		// računa koji treba uplatiti kao i procenat tog računa kojeg želimo
		// platiti kao napojnicu te izračunava ukupan račun i napojnicu. Na
		// primjer, ukoliko korisnik unese 10 kao račun i 15 % kao procenat za
		// napojnicu program treba da ispiše da je ukupan račun za uplatiti 11.5
		// a napojnica 1.5.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku pitanje
		System.out.println("Unesite ukupan iznos racuna u KM:");
		// racun smjestamo u doble racun
		double racun = input.nextDouble();
		// ispis korisniku
		System.out.println("Unesite procenat racuna kojeg zelite dati kao napojnicu u KM:");
		// procenat je int jer je uvijek cijeli broj
		int procenat = input.nextInt();
		// racunanje napojnice
		double napojnica = (double) procenat * racun / 100;
		// racunanje ukupnog racuna za uplatiti
		double racunZaPlatiti = +racun + napojnica;
		// ispis
		System.out.println("Ukupan racun za uplatiti je : " + racunZaPlatiti);
		System.out.println("A napojnica je: " + napojnica);
		// zatvaramo skener
		input.close();
	}

}
