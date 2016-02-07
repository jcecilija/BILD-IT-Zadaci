package zadaci_25_01_2016;

public class ProstiBrojevi {

	public static void main(String[] args) {
		// Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
		// ukljućujući i 2 i 1000. Program treba da ispiše 8 brojeva po liniji
		// te razmak između brojeva treba da bude jedan space.

		int brojac = 0;// brojac prostih po liniji
		// sa for petljom prolazimo kroz sve brojeve od 2 do 1000 ukljucujuci i
		// njih
		for (int i = 2; i <= 1000; i++) {
			// postavljamo boolean na true
			boolean prost = true;
			// sa drugom for petljom pronalazimo prost broj
			for (int j = 2; j <= i / 2; j++) {
				// ako je broj djeljiv sa nekim brojem onda nije prost
				if (i % j == 0) {
					// i prost postaje false
					prost = false;
					// prekida se petlja
					break;
				} // u suprotnom kad je broj prost
				else if (prost) {
					// inkrementiramo brojac
					brojac++;
					// uslov za 8 po liniji
					if (brojac % 8 == 0) {
						// ako je ispunjen uslov u novi red prelazak
						System.out.println(i);
					} else {
						// stampa proste jedan do drugog odvojene spaceom jednim
						System.out.print(i + " ");
					}
				}
			}
		}
	}
}
