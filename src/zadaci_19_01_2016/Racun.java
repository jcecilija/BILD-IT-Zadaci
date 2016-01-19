package zadaci_19_01_2016;

import java.util.Scanner;

public class Racun {

	public static void main(String[] args) {
		// Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun koji ima
		// godišnju interesnu stopu od 5%. Mjesečna interesna stopa je stoga
		// 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na računu postaje
		// 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na
		// računu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon
		// trećeg mjeseca, vrijednost na računu postaje (100 + 201.252) * (1 +
		// 0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika
		// da unese mjesečni iznos štednje te broj mjeseci nakon kojeg bi želio
		// znati stanje računa.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesecni iznos stednje");
		double iznosStednje = input.nextDouble();// koliko cemo stedit
		System.out.println("Na koliko dugo mjeseci");
		int mjeseci = input.nextInt();// na koliko mjeseci
		System.out.println("Unesite godisnju interesnu stopu");
		double godisnjaStopa = input.nextDouble();
		double mjesecnaStopa = godisnjaStopa / 12;
		double iznosNaKraju = 1 + mjesecnaStopa;// za pocetak deklarisemo ovako
												// jer ovo je samo za prvi
												// mjesecm a svaki drugi se
												// povecava
		for (int i = 1; i <= mjeseci; i++) {
			iznosNaKraju = iznosNaKraju + (iznosStednje * (1 + mjesecnaStopa));// formula
																				// za
																				// racunanje
																				// koja
																				// se
																				// ponavlja
																				// za
																				// svaki
																				// mjesec
		}
		System.out.println("Stanje na vasem racunu na kraju " + mjeseci + " je " + iznosNaKraju);
		input.close();
	}

}
