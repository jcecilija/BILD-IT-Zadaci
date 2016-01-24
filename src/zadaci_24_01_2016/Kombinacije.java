package zadaci_24_01_2016;

public class Kombinacije {

	public static void main(String[] args) {
		// Napisati program koji ispisuje sve moguće kombinacije za biranje dva
		// broja u rasponu od 1 do 7. Također, program ispisuje broj svih
		// mogućih kombinacija. Dakle, program treba da ispiše sve moguće parove
		// brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj mogućih
		// kombinacija je 21.

		// brojac kombinacija
		int counter = 0;
		// sa duplom for petljom prolazimo kroz svaki broj od 1 do 7
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				// ispis
				System.out.println(i + " " + j);
				// kad god ispisemo neku kombinaciju inkrementiramo brojac
				counter++;
			}
		}
		// ispis brojaca
		System.out.println(counter);
	}
}
// ne znam kako u postavci zadatka pise da je broj kombinacija 21, kad ja kad
// pobrojim bude 49, jer po meni su dvije razlicite kombinacije npr 4 1  i  1 4