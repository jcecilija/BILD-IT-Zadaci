package projekatPriprema;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testiranje {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Konekcija k = new Konekcija();
		// Pretraga test = new Pretraga();
		k.getConnection();
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Unesite sta zelite da pretrazujete: 2 za grad po broju stanovnika a 1 za gradove sa odredjenim imenom");
		int broj = 0;
		boolean uslov = true;
		while (uslov) {
			try {
				broj = input.nextInt();
				if (broj == 1 || broj == 2) {
					uslov = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				input.nextLine();
			}
		}
		input.close();
		if (broj == 1) {
			Pretraga.prikaziSve();
		} else if (broj == 2) {
			Pretraga.prikaziGradove();
		}
	}
}