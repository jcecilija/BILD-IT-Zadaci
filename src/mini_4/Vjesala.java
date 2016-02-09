package mini_4;

import java.util.Scanner;

public class Vjesala {

	public static void main(String[] args) {
		// Igra se zove vjesala , unesemo receniuc koju ce neko da pogadja
		// osoba koja pogadja ima pravo na 30 pokusaja

		// skener za citanje sa konzole
		Scanner input = new Scanner(System.in);
		// ispis nama da unesemo recenicu
		System.out.println("Unesite recenicu koju ce drugi da pogadjaju!");
		// smjestamo nasu recenicu
		String recenica = input.nextLine();
		// inicijalizacija praznog polja
		char razmak = ' ';
		// pretvaramo nasu recenicu u niz karaktera da bi mogli porediti slovo
		// koje igrac unese
		char[] recenica1 = recenica.toCharArray();
		// pravimo drugi niz sa istom recenicom
		char[] recenica2 = recenica.toCharArray();
		// ispis
		System.out.println("Molim pogodite rijeci");
		// sa for petljom ispisujemo igracu tackice umjesto slova i prazno gdje
		// prazno
		for (int i = 0; i < recenica1.length; i++) {
			if (recenica1[i] == razmak) {
				System.out.print(" ");
			} else
				System.out.print(".");
		}
		for (int i = 0; i < recenica.length(); i++) {
			if (recenica2[i] != ' ') {
				recenica2[i] = '.';
			}
		}
		// odgovor
		char odgovor;
		// broj pokusaja brojac
		int brojPokusaja = 30;
		// uslov
		while (brojPokusaja > 0) {
			// kada igrac pokusa jednom umanjujemo mu broj pokusaja
			brojPokusaja--;
			// uzimamo korisnikov unos i smjestamo u promjenljivu odgovor
			odgovor = input.next().charAt(0);
			// sa for petljom prolazimo kroz niz tj nasu recenicu
			for (int i = 0; i < recenica.length(); i++) {
				// i poredimo da li je korisnik unio slovo koje ima u nasoj
				// recenici
				if (odgovor == recenica1[i]) {
					recenica2[i] = recenica1[i];
				} // ukoliko jeste ispisujemo to slovo na odgovarajucem mjestu
				System.out.print(recenica2[i]);
			} // prelazaka u novi red
			System.out.println();
		} // uslov ako nije igrac pogodio od 30 puta i ispis
		if (recenica2.equals(recenica1) == false) {
			System.out.println("Nemate pravo vise pokusavat, niste pogodili od 30 pokusaja!");
		}
		// zatvaramo skener
		input.close();

	}

}
