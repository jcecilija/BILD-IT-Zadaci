package zadaci_19_01_2016;

import java.util.Scanner;

public class NajveciPrefiks {

	public static void main(String[] args) {
		// TNapisati program koji pita korisnika da unese 2 stringa te ispisuje
		// najveći zajednički prefix za ta dva stringa, ukoliko isti postoji. Na
		// primjer, ukoliko korisnik unese sljedeća dva stringa
		// "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da
		// ispiše: Najveći zajednički prefix za dva stringa je "Dobrodošli u".
		// koristimo skener i ucitavamo dva stringa
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string");
		String prvi = input.nextLine();
		System.out.println("Unesite drugi string");
		String drugi = input.nextLine();
		// stringove pretvaramo u niz carova da ih mozemo porediti po indexu
		char[] prv = prvi.toCharArray();
		char[] drug = drugi.toCharArray();
		// inicijalizujemo prazan string u koji ceo smjestat zajednicke
		// karaktere
		String zajednicki = "";
		int duzina;// je duzina do koje cemo provjeravat zajednicki prefiks
		if (prvi.length() > drugi.length()) {// ukoliko je prvi string veci od
												// drugog onda cemo provjeravat
												// samo do duzine drugog
			duzina = drugi.length();
		} else
			duzina = prvi.length();
		for (int i = 0; i < duzina; i++) {// sa for petljom prolazimo kroz istu
											// duzinu stringova
			if (prv[i] == drug[i]) {// ukoliko su karakteri na istim pozicijama
									// isti
				zajednicki = zajednicki + prv[i];// taj karakter dodajemo u
													// string zajednicki
			} else
				// ako uslov nije ispunjen prekidamo sa forom
				break;
		}
		if (prv[0] != drug[0]) {// ukoliko pocetni karakter u stringovima nisu
								// isti ispisujemo
			System.out.println("Stringovi nemaju zajednicki prefiks");
		} else
			// ispisujemo sta se trazi u zadatku
			System.out.println("Najveci zajednicki prefiks za dva string je: " + zajednicki);
		input.close();
	}
}
