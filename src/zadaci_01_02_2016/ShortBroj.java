package zadaci_01_02_2016;

import java.util.Scanner;

public class ShortBroj {

	public static void main(String[] args) {
		// U javi, short vrijednost se sprema u samo 16 bita. Napisati program
		// koji pita korisnika da unese short broj te mu ispiše svih 16 bita za
		// dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program
		// mu ispisuje 0000000000000101

		// skener za ucitat broj
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite short broj:");
		// smjestamo short broj
		short broj = input.nextShort();
		// pravimo jedan niz tipa string sa svim binarnim brojevima od 1 do 15
		String[] binarni = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		// napravimo jedan string u koji cemo da smjestimo short broj u binarnom
		// obliku
		String brojShort = "";
		// uslov da dobijemo sve cifre iz shorta
		while (broj > 0) {
			// int privremeno je broj % 10 da dobijemo zadnju cifru
			int temp = broj % 10;
			// brojShort smjestamo binarni broj za pojedine brojeve
			brojShort += binarni[temp];
			// a broj onda dijelimo sa 10 da odbijemo jednu tu cifru sto smo je
			// dodali u brojShort
			broj /= 10;
		} // sa for petljom ispisujemo onoliko 0 koliko ima praznih mjesta od
			// pocetka do broja short u binarnom obliku
		for (int i = brojShort.length(); i < 16; i++) {
			System.out.print("0");
		} // u istom redu ispisujemo broj short u binarnom obliku
		System.out.print(brojShort);
		// zatvaramo skener
		input.close();
	}
}
