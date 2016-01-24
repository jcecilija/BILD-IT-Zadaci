package zadaci_24_01_2016;

import java.util.Scanner;

public class BrojPonavljanjaUStringu {

	// metoda
	public static int count(String str, char a) {
		// brojac na nula
		int brojac = 0;
		// pretvaramo string u niz karaktera
		char[] niz = str.toCharArray();
		// sa for petljom prolazimo kroz niz
		for (int i = 0; i < niz.length; i++) {
			// poredimo svaki karakter u nizu sa nasim karakterom
			if (a == niz[i]) {
				// ukoliko su isti brojac inkrementiramo
				brojac++;
			}
		}
		// metoda vraca broj ponavljanja
		return brojac;
	}

	public static void main(String[] args) {
		// Napisati metodu koja pronalazi broj ponavljanja određenog karaktera u
		// stringu. Metoda treba da koristi sljedeći header: public static int
		// count(String str, char a). Na primjer, ukoliko pozovemo metodu na
		// sljedeći način: count("Welcome", e) metoda treba da vrati 2. Napisati
		// program koji pita korisnika da unese string i koji karakter želi da
		// prebroji u datom stringu te mu ispiše koliko se puta određeni
		// karakter ponovio u zadatom stringu

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite neki string: ");
		// smjestamo korisnikov unos
		String unos = input.nextLine();
		// ispis
		System.out.println("Koji karakter zelite da prebrojite:");
		// smjestamo korisnikov unos kao string
		String karakter = input.nextLine();
		if (karakter.length() != 1) {
			System.out.println("Morate unijeti tacno jedan karakter!");
			System.exit(1);
		}
		// pa pretvaramo string u karakter ustvari prvi znak stringa
		// uzimamo,tako se sa skenerom ucitava karakter
		char a = karakter.charAt(0);
		// ispis
		System.out.println("Karakter " + a + " u stringu - " + unos + "  - se ponovio " + count(unos, a) + " puta");
		input.close();
	}
}
