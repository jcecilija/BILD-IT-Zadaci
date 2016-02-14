package zadaci_12_02_2016;

import java.util.Scanner;

public class TreciSuma {

	public static void main(String[] args) {
		// (InputMismatchException) Write a program that prompts the user to
		// read
		// two integers and displays their sum. Your program should prompt the
		// user to
		// read the number again if the input is incorrect.

		// skener za unos brojeva sa konzole
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesi dva cijela broja");
		// deklarisemo brojeve
		int prvi;
		int drugi;
		// uvijek prvo ide while a u zagradi true
		while (true) {
			// pa otvorimo viticastu i try pa viticasta
			try {
				// pisemo sta treba
				prvi = input.nextInt();
				drugi = input.nextInt();
				// uslov da bude cio broj nam treba
				if (prvi < 0 || prvi > 9 || drugi < 0 || drugi > 9) {
					System.out.println("Unesite ponovo");
					// nastavak
					continue;
				} // prekidamo petlju ako je tacno
				break;
			}
			// poslije break zatvorimo viticastu i ispisemo gresku
			catch (Exception ex) {
				System.out.println("Unesite cio broj:");
				// a mora biti i input.nextLine() da ide ponovo na unos u try
				input.nextLine();
			}
		}
		input.close();
		// suma se trazi
		int suma = prvi + drugi;
		// ispis
		System.out.println("Suma je : " + suma);
	}
}
