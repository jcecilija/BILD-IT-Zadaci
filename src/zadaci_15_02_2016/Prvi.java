package zadaci_15_02_2016;

import java.util.Scanner;

public class Prvi {

	public static int bin2Dec(String binaryString) {
		// uslov ako zadani string nije binarni string tj sadrzi nesto jos pored
		// nule ili jedinice
		if (!isBinaryString(binaryString)) {
			throw new NumberFormatException("To nije binarni broj!");
		} else {
			int brojDecimalni = 0;
			// posto je to binarni string potrebno ga je pretvoriti u decimalni
			// broj
			for (int i = binaryString.length() - 1; i >= 0; i--) {
				// ako je neki karakter u stringu broj 1 onda je
				if (binaryString.charAt(i) == '1') {
					// binaryString.length() - 1 - i je broj kojim mnozimo bazu
					// 2 i sabiramo
					brojDecimalni += Math.pow(2, binaryString.length() - 1 - i);
				}
			}
			// vrati decimalni broj
			return brojDecimalni;
		}
	}

	public static boolean isBinaryString(String binaryString) {
		// provjeravamo da li je svaki karakter u stringu nula ili jedan
		// prolazimo kroz citavu duzinu stringa
		for (int i = 0; i < binaryString.length(); i++) {
			// uslov ako nije ispunjen
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				// vrati false
				return false;
			}
		} // vrati true
		return true;
	}

	public static void main(String[] args) {
		// NumberFormatException) Write the bin2Dec(String binaryString)
		// method to convert a binary string into a decimal number. Implement
		// the
		// bin2Dec method to throw a NumberFormatException if the string is not
		// a
		// binary string.

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite binarni broj koji zelite pretvoriti u decimalni: ");
		try {
			String binarni = input.next();
			// inicijalizujemo decimalni broj tako sto pozivamo metodu
			int decimalniBroj = bin2Dec(binarni);
			// i ispisujemo ako nema greske
			System.out.println(binarni + " binarni broj pretvoren u decimalni je : " + decimalniBroj);
		} // uhvati gresku
		catch (NumberFormatException e) {
			// ispisi gresku
			System.out.println(e);
		} // zatvoren skener
		input.close();
	}
}
