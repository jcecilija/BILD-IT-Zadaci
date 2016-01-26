package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AbecedniRed {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese imena tri grada te ih
		// ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago,
		// Los Angeles i Atlanta kao gradove, program vraća Atlanta, Chicago,
		// Los Angeles

		// pravimo skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite imena tri grada odvojena enterom: ");
		// pravimo array listu u koju smjestamo svaki grad
		ArrayList<String> gradovi = new ArrayList<String>();
		String grad1 = input.nextLine();
		gradovi.add(grad1);
		String grad2 = input.nextLine();
		gradovi.add(grad2);
		String grad3 = input.nextLine();
		gradovi.add(grad3);
		// poslije pola dana trazenja kako naisla sam na metodu collections.sort
		// koja sortira po abecednom redu stringove u listi
		Collections.sort(gradovi);
		// ispis sa for ic petljom
		for (String s : gradovi) {
			System.out.println(s);
		}
		input.close();
	}
}
