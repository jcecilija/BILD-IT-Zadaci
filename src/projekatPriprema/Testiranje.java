package projekatPriprema;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testiranje {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// skener
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Unesite sta zelite da pretrazujete: 2 za grad po broju stanovnika a 1 za gradove sa odredjenim imenom");
		// inicijalizujemo korisnikov unos
		int broj = 0;
		// uslov za petlju
		boolean uslov = true;
		while (uslov) {
			try {// korisnik treba da unese 1 ili 2
				broj = input.nextInt();
				if (broj == 1 || broj == 2) {
					uslov = false;
				} // u slucaju greske hvataj gresku ispisi i ponovi
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				input.nextLine();
			}
		}
		input.nextLine();
		// uslov
		if (broj == 1) {
			// ispis
			System.out.println("Unesite ime grada ");
			// poziv metode koja pretrazuje bazu i ispisuje
			Pretraga.prikaziSve(input.nextLine());
			// drugi uslov
		} else if (broj == 2) {
			// ispis
			System.out.println("Unesite pocetni i krajnji broj populacije");
			// poziv metode koja prikazuje gradove po trazenom broju populacije
			Pretraga.prikaziGradove(input.nextLong(), input.nextLong());
		}
		input.close();
	}
}