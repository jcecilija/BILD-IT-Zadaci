package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class KolikoPutaNajveci {

	public static void main(String[] args) {
		// Napisati program koji učitava niz brojeva, pronalazi najveći broj te
		// ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
		// brojeva završava sa nulom.

		Scanner input = new Scanner(System.in);// scanner za unos
		System.out.println("Unesite brojeve u niz a 0 zavrsava unos!");
		// pravimo listu gdje cemo smjestat brojeve
		ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
		int broj;
		do {// petlja koja nam omogucava unos brojeva sve dok korisnik ne unese
			// 0
			broj = input.nextInt();
			nizBrojeva.add(broj);
		} while (broj != 0);// dokle god je broj razlicit od nule korisnik moze
							// da unosi brojeve u niz
		int najveci = 0;// inicijalizujemo najveci
		for (int i : nizBrojeva) {// for ic petlja da nadjemo najveci broj
			if (najveci < i) {
				najveci = i;
			}
		}
		int brojac = 0;// brojac za najveci koliko puta se ponovio
		for (int i : nizBrojeva) {// sa for ic petljom prolazimo kroz niz i samo
									// gledamo najveci
			if (i == najveci) {
				brojac++;// brojimo koliko puta je ispunjen uslov tj koliko puta
							// se ponovio najveci broj
			}
		} // ispis najveceg i koliko puta se ponovio
		System.out.println("Najveci broj u vasem nizu je " + najveci + " a ponovio se " + brojac + " puta");
		input.close();// zatvoren skener
	}

}
