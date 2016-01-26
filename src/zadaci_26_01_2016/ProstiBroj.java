package zadaci_26_01_2016;

public class ProstiBroj {

	// metoda provjerava da li je broj prost
	public static int isPrime(int n) {
		// sa for petljom gledamo svaki broj do polovine broja kojeg
		// provjeravamo da li je prost, a prost je samo ako je djeljiv sa 1 i sa
		// samim sobom
		// ali prvo definisemo da je broj prost broj
		boolean jeProst = true;
		for (int i = 2; i <= n / 2; i++) {
			// ako je broj djeljiv sa nekim brojem
			if (n % i == 0) {
				// znaci da nije prost
				jeProst = false;
				// prekidamo petlju
				break;
			}
		}
		// ako je prosti onda vracamo taj broj
		if (jeProst) {
			return n;
			// ako nije vrati nulu
		} else
			return 0;
	}

	public static void main(String[] args) {
		// Napisati metodu sa sljedećim headerom: public static int isPrime(int
		// n) koja provjerava da li je broj prost/prime. Napsati test program
		// koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0
		// do 100000.

		// sa for petljom prolazimo kroz sve brojeve u zadanom rasponu
		// inicijalizujemo brojac za koliko po liniji
		int counterPerLine = 10;
		for (int i = 0; i <= 100000; i++) {
			// poziv metode i uslov za stampanje, ako metoda ne vrati nulu
			// stampaj taj broj
			if (isPrime(i) != 0) {
				System.out.print(i + " ");
				// inkrementiramo brojac po liniji
				counterPerLine++;
				// uslov
				if (counterPerLine % 10 == 0) {
					// prelazak u novi red
					System.out.println();
				}
				// u suprotnom nastavi
			} else
				continue;
		}
	}
}