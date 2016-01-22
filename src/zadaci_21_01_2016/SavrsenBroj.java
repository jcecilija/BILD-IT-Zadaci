package zadaci_21_01_2016;

public class SavrsenBroj {

	public static void main(String[] args) {
		// Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih
		// svojih pozitivnih djelilaca, isključujući sebe. Na primjer, 6 je prvi
		// savršeni broj jer 6 = 3 + 2 + 1. Sljedeći savršeni broj je 28 jer 28
		// = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do
		// 10.000. Napišite program koji ispisuje sva 4

		// sa for petljom prolazimo kroz sve brojeve od 1 do 10000
		for (int i = 1; i <= 10000; i++) {
			int zbir = 0;// inicijalizujemo zbir svih pozitivnih djelilaca
			for (int j = 1; j <= i; j++) {// druga for petlja kojom provjeravamo
											// svaki broj
				if (i % j == 0 && j != i) {// sa kojim brojevima je djeljiv bez
											// ostatka i da taj broj nije on sam
					zbir = zbir + j;// i onda racunamo zbir tih djelilaca
				}
			}
			if (zbir == i) {// ako je zbir svih pozitivnih djelilaca jednak tom
							// broju za kojeg racunamo
				System.out.println(i + " je savrsen broj ");// onda ispisi taj
															// broj kao savrsen
															// broj
			}
		}
	}
}