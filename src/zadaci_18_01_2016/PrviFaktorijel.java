package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class PrviFaktorijel {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese neki cijeli broj te
		// ispisuje njegove najmanje faktore u rastućem redosljedu. Na primjer,
		// ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2
		// * 2 * 2 * 3 * 5 = 120)
		Scanner input = new Scanner(System.in);// sa skenerom ucitavamo sa
												// konzole broj
		System.out.println("Unesite neki cijeli broj:");// ispis korisniku da
														// unese broj
		int broj = input.nextInt();// unijeti broj smjestamo u varijablu broj
		int pocetni = broj;// broj dodijeljujemo i varijabli pocetni da bi ga
							// poslije mogli ispisat nepromijenjenog
		ArrayList<Integer> faktori = new ArrayList<>();// pravimo array listu
														// integera gdje cemo
														// smjestat faktore zato
														// sto ne znamo koliko
														// ce ih bit unaprijed
		int n = 2;// pocinjemo ispitivanje od broja 2
		while (broj != 1) {// dokle god broj je razlicit od 1
			if (broj % n == 0) {// trazimo najmanje faktore uz uslov da je broj
								// modul sa 2 jednak nula
				broj = broj / n;// broj sada postaje broj/2
				faktori.add(n);// u listu dodajemo faktor n u prvom slucaju 2
			} else
				n++;// inkrementiramo n ukoliko prethodni uslov nije tacan
		}
		System.out.println("Unijeli ste broj: " + pocetni + " a njegovi prosti faktori su :");// ispis
		for (int i : faktori) {// sa for petljom kroz listu
			System.out.print(i + " ");// ispisujemo faktore
		}
		input.close();
	}
}
