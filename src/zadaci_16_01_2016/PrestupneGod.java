package zadaci_16_01_2016;

public class PrestupneGod {

	public static void main(String[] args) {
		// Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
		// godine 101 do 2100, odvojene jednim spaceom. Također ispisati i
		// ukupan broj prijestupnih godina u ovom vremenskom periodu.

		int pocetna = 101;// godina od koje se trazi racunanje
		int zadnja = 2100;// godina do koje se racunaju prestupne
		int brojac = 0;// brojac prestupnij
		int counter = 0;
		for (int i = pocetna; i <= zadnja; i++) {// for petlja za prolazak kroz
													// sve godine u zadanom
													// intervalu
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {// uslov koji ako
																// je ispunjen
																// godina je
																// prestupna
				System.out.print(i + " ");
				counter++;
				brojac++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\nU ovom vremenskom periodu ukupan broj prestupnih godina je: " + brojac);
	}

}
