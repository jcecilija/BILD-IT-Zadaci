package zadaci_21_01_2016;

import java.util.Scanner;

public class Password {
	// metoda koja nam vraca true ako je lozinka 8 ili duze karaktera
	public static boolean duzina(char[] password) {
		if (password.length < 8) {
			return false;
		} else
			return true;
	}

	// metoda koja nam vraca true ako lozinka sadrzi dva ili vise brojeva
	public static boolean brojevi(char[] password) {
		// brojevi u ascii su od 48 do 57
		// inicijalizujemo brojac koji ce brojit koliko ima brojeva u nasoj
		// lozinki
		int brojac = 0;
		for (int i = 0; i < password.length; i++) {
			if ((password[i] >= 48) && (password[i] <= 57)) {
				brojac++;
			}
		} // uslov koji se trazi
		if (brojac >= 2) {
			return true;
		}
		return false;
	}

	// metoda koja vraca true ako nasa lozinka sadrzi slova velika ili mala
	// svejedno
	public static boolean slova(char[] password) {
		for (int i = 0; i < password.length; i++) {
			if ((password[i] >= 65 && password[i] <= 90) || (password[i] >= 97 && password[i] <= 122)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Neke web stranice forsiraju određena pravila za passworde. Napisati
		// metodu koja provjerava da li je unijeti string validan password.
		// Pravila da bi password bio validan su sljedeća: 1. Password mora biti
		// sačinjen od najmanje 8 karaktera. 2. Password smije da se sastoji
		// samo od slova i brojeva. 3. Password mora sadržati najmanje 2 broja.
		// Napisati program koji pita korisnika da unese password te mu ispisuje
		// "password je validan" ukoliko su sva pravila ispoštovana ili
		// "password nije validan" ukoliko pravila nisu ispoštovana

		// skener za unos lozinke
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password:");
		String lozinka = input.nextLine();
		// lozinku koju smo unijeli kao string pretvaramo u niz carova da bi
		// mogli to prosljedivat metodama
		char[] password = lozinka.toCharArray();
		// uslov ako svaka od metoda vrati true onda je passwor validan
		if (((duzina(password)) && (brojevi(password)) && (slova(password)))) {
			System.out.println("Password je validan");
		} else
			System.out.println("Password nije validan");

		input.close();
	}
}
