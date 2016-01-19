package zadaci_18_01_2016;

public class CetvrtiMetoda {

	public static void Stampaj() {
		int[] nizBrojeva = new int[100];// deklarisemo niz sa brojevima
		int[] slova = new int[100];// niz sa slovima
		for (int i = 0; i < 100; i++) {// sad for petljom punimo nasumicno oba
										// niza zajedno
			nizBrojeva[i] = 10 + (int) (Math.random() * 25);// za brojeve sam
															// onako odredila
															// neke manje da
															// budu od 10 do 35
			slova[i] = (int) (Math.random() * 26) + 65;// a slova da bi dobili
														// koristimo poznato
														// stanje u ascii kodu
														// na kojem se broju
														// nalaze velika slova
														// alfabeta
		}
		int brojacPoLiniji = 0;// postavimo brojac po liniji na nula
		for (int i = 0; i < nizBrojeva.length; i++) {// sa for petljom prolazimo
														// kroz niz
			System.out.print(nizBrojeva[i] + " ");// stampamo svaki clan niza
			brojacPoLiniji++;// i uvecavamo brojac po liniji za jedan kad
								// ostampamo jedan clan niza
			if (brojacPoLiniji == 10) {// uslov ukoliko je brojac stigao na 10
				System.out.println();// prelazimo u novi red
				brojacPoLiniji = 0;// a brojac postavljamo na nula
			}
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.print((char) slova[i] + " ");// stampamo slova tako sto
													// stavimo char ispred broja
													// slova u asci kodu
			brojacPoLiniji++;// inkrement brojaca po liniji
			if (brojacPoLiniji == 10) {// uslov ukoliko je brojac stigao na 10
				System.out.println();// prelazimo u novi red
				brojacPoLiniji = 0;// a brojac postavljamo na nula
			}
		}
	}

	public static void main(String[] args) {
		// Napisati metodu koja printa 100 nasumičnih uppercase karaktera i 100
		// nasumičnih brojeva, 10 po liniji.

		Stampaj();// poziv metode u mainu
	}

}
