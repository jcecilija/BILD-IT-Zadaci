package zadaci_22_01_2016;

public class DjeljiviSa {

	public static void main(String[] args) {
		// Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10
		// brojeva po liniji, koji su djeljivi i sa 5 i sa 6. Razmak između
		// brojeva treba biti tačno jedan space.
		int counter = 0;// brojac koji ce brojit brojeve koje ispisujemo
		for (int i = 100; i <= 1000; i++) {// sa for petljom prolazimo kreoz sve
											// brojeve u zadanom intervalu
			if (i % 5 == 0 && i % 6 == 0) {// uslov koji se trazi
				System.out.print(i + " ");// ako je ispunjen stampamo sa
											// razmakom
				counter++;// brojac ostampanih povecavamo za jedan
				if (counter == 10) {// ukoliko je brojac po liniji jednak 10
					System.out.println();// prelazimo u novi red
					counter = 0;// a brojac postavljamo na nula
				}
			}
		}
	}
}