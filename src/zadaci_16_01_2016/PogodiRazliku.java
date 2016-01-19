package zadaci_16_01_2016;

import java.util.Scanner;

public class PogodiRazliku {

	public static void Razlika() {
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko zelite pitanja?");
		int brPitanja = input.nextInt();
		int brojTacnih = 0;
		int brojNetacnih = 0;
		for (int i = 0; i < brPitanja; i++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 20);
			System.out.println("Koliko je: " + a + " - " + b);
			int korisnikovRezultat = input.nextInt();
			if ((korisnikovRezultat) == (a - b)) {
				brojTacnih++;
			} else
				brojNetacnih++;
		}
		System.out.println(
				"Od ukupno " + brPitanja + " tacno ste odgovorili na " + brojTacnih + " a netacno na " + brojNetacnih);
		input.close();
	}

	public static void main(String[] args) {
		// Napisati metodu koja prima jedan argument, broj pitanja, te generiše
		// toliko nasumičnih, jednostavnih pitanja oduzimanja tipa : „Koliko je
		// 5 - 2 ?“. Metoda treba da broji broj tačnih i netačnih odgovora te ih
		// ispiše korisniku.

		Razlika();
	}
}
