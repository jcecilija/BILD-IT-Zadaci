package zadaci_17_02_2016;

import java.io.File;
import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		// (Occurrences of each letter) Write a program that prompts the user to
		// enter
		// a file name and displays the occurrences of each letter in the file.
		// Letters are case-insensitive.

		// skener za ucitati ime fajla u kojem treba da brojimo koliko puta se
		// koje slovo pojavilo
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla");
		String fileIme = input.nextLine();
		try {
			File file = new File(fileIme);
			Scanner ulaz = new Scanner(file);
			// pravimo niz od 26 koliko ima slova u alfabetu
			int[] brojacSlova = new int[26];
			// pravimo niz carova sa slovima
			char[] slova = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
					'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
			// pravimo string tipa tekst prazan
			String tekst = "";
			// uslov pomocu kojeg citamo fajl
			while (ulaz.hasNextLine()) {
				// smjestamo u tekst iz fajla tekst i pretvaramo sve u velika
				// slova
				tekst = ulaz.nextLine().toUpperCase();
				// sa for petljom prolazimo kroz nas tekst velikih slova
				for (int i = 0; i < tekst.length(); i++) {
					// sada slovo po slovo poredimo
					char slovoI = tekst.charAt(i);
					// sada gledamo ako je slovoI neko od slova alfabeta , onda
					// inkrementiramo index niza na kojem se nalazi nase slovo
					for (int j = 0; j < slova.length; j++) {
						if (slovoI == (slova[j])) {
							brojacSlova[j]++;
						}
					}
				}
			} // ispisujemo koliko se koje slovo ponovilo
			for (int i = 0; i < brojacSlova.length; i++) {
				System.out.println("Slovo " + slova[i] + " se ponovilo : " + brojacSlova[i] + " puta");
				// zatvaramo skener ulaz
				ulaz.close();
			}
			// zatvaramo skener input
			input.close();
			// hvatanje greske
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
