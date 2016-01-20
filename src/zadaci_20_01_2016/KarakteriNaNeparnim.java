package zadaci_20_01_2016;

import java.util.Scanner;

public class KarakteriNaNeparnim {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese neki string te mu
		// ispisuje sve karaktere koji se nalaze na neparnim pozicijama. Na
		// primjer, ako korisnik unese string Beijing Chicago, program vraća
		// BiigCiao

		Scanner input = new Scanner(System.in);// skener za unos sa konzole
		System.out.println("Unesite neki string");// ispis korisniku da unese
													// neki tekst
		String unos = input.nextLine();// tekst smjestamo u string unos
		char[] tekst = unos.toCharArray();// zatim unos smjestamo u niz
											// karaktera
		for (int i = 0; i < tekst.length; i++) {// sa for petljom prolazimo kroz
												// svaku poziciju karaktera
			if (i % 2 == 0) {// uslov ako je pozicija koja pocinje od nula,znaci
								// 0 1 2 3 4, modul sa 2 = 0, onda je to neparna
								// pozicija
				System.out.print(tekst[i]);// stampamo karakter na toj poziciji
			}
		}
		input.close();
	}
}
