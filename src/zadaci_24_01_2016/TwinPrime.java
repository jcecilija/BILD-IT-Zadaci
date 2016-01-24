package zadaci_24_01_2016;

import java.util.ArrayList;

public class TwinPrime {

	public static void main(String[] args) {
		// Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
		// primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su
		// također twin primes. Napisati program koji ispisuje sve twin prime
		// brojeve manje od 10000, 10 parova po liniji.
		// pravimo arraylistu integera jer ne znamo koliko ce bit prostih
		// brojeva
		ArrayList<Integer> prosti = new ArrayList<Integer>();
		// sa for petljom prolazimo kroz brojeve manje od 10000
		for (int i = 0; i < 10000; i++) {
			// postavljamo boolean na true
			boolean isPrime = true;
			// druga for petlja za nalazak prime broja
			for (int j = 2; j <= i / 2; j++) {
				// uslov da broj nije prost
				if (i % j == 0) {
					isPrime = false;
					// prekidamo petlju
					break;
				}
			}
			// ako je broj prost dodajemo ga u arraylistu prosti
			if (isPrime) {
				prosti.add(i);
			}
		}
		// pravimo novu arraylistu u koju cemo smjestat twin primes kao
		// stringove da bi ih poslije mogli lakse ispisat
		ArrayList<String> twin = new ArrayList<String>();
		// brojac za parove prostih
		int counter = 0;
		// sa for petljom prolazimo kroz arraylistu dobijenih prostih brojeva
		for (int i = 0; i < prosti.size() - 1; i++) {
			// uslov ako je razlika izmedju dva prosta broja = 2
			if (prosti.get(i + 1) - prosti.get(i) == 2) {
				// pretvaramo prvi prosti u string
				String prvi = prosti.get(i).toString();
				// pretvaramo drugi prosti u string
				String drugi = prosti.get(i + 1).toString();
				// pravimo novi string sa dva uzastopna prosta broja cija je
				// razlika =2
				String prime = prvi + " i " + drugi;
				// i dodajemo taj par u arraylistu twin
				twin.add(prime);
			}
		}
		// sa for petljom prolazimo kroz array sa parovima
		for (int j = 0; j < twin.size() - 1; j++) {
			// ispisujemo ih
			System.out.print(twin.get(j) + "  ");
			// svaki put kad ispisemo counter inkrementiramo
			counter++;
			// uslov za 10 parova po liniji
			if (counter % 10 == 0) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
