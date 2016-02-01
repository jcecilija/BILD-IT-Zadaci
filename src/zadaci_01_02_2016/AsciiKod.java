package zadaci_01_02_2016;

import java.util.Scanner;

public class AsciiKod {

	public static void main(String[] args) {
		// Napisati program koji prima ASCII kod (cijeli broj između 0 i 127) te
		// ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69
		// kao ASCII kod, program mu ispisuje da je karakter sa tim brojem
		// karakter E.

		// skener za citanje sa konzole
		Scanner input = new Scanner(System.in);
		// ispis na konzoli
		System.out.println("Unesite kao ascii kod broj izmedju 0 i 127:");
		// smjestamo unijeti broj
		int broj = input.nextInt();
		// pretvaramo broj u ascii karakter
		char asci = (char) broj;
		// ispis
		System.out.println("Unijeli ste " + broj + " a karakter sa tim brojem je: " + asci);
		// zatvaramo skener
		input.close();
	}

}