package zadaci_17_01_2016;

import java.util.Scanner;

public class Lokacija {

	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];// postavimo kao najveci element niza da je na
								// poziciji [0][0]
		int[] lokacija = new int[2];// napravimo niz u koji cemo smjestiti
									// lokaciju najveceg elementa
		for (int i = 0; i < a.length; i++) {// sa duplom for petljom
			for (int j = 0; j < a[i].length; j++) {// prolazimo kroz sve
													// elemente 2Dniza
				if (max < a[i][j]) {// poredimo max sa svakim
					max = a[i][j];// dobijamo najveci
					lokacija[0] = i;// i dodjeljujemo lokaciji na nultoj
									// poziciji poziciju redu
					lokacija[1] = j;// a lokaciji na prvoj poziciji lokaciju
									// kolone
				}
			}
		}
		return lokacija;// metoda vraca lokaciju
	}

	public static void main(String[] args) {
		// Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu.
		// Metoda treba da koristi sljedeći header:

		// Napisati test program koji pita korisnika da unese 2D niz te mu
		// ispisuje lokaciju najvećeg elementa u nizu.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona u vasem 2D nizu:");// korisnik
																					// unosi
																					// koliko
																					// zeli
																					// redova
																					// i
																					// kolona
																					// 2Dniz
																					// da
																					// ima
		int redova = input.nextInt();
		int kolona = input.nextInt();
		double[][] niz = new double[redova][kolona];// kreiramo niz kakav
													// korisnik zeli
		System.out.println("Unesitu niz " + niz.length + "reda i " + niz[0].length + " kolone:");
		// sa dvije for petlje punimo niz unosom od korisnika
		for (int red = 0; red < niz.length; red++) {
			for (int kolone = 0; kolone < niz[red].length; kolone++) {
				niz[red][kolone] = input.nextDouble();// korisnik moze da unosi
														// double vrijednosti
			}
		}
		System.out.println("U vasoj matrici ");// ispisujemo matricu tj niz koju
												// je korisnik unio
		for (int red = 0; red < niz.length; red++) {
			for (int kolone = 0; kolone < niz[red].length; kolone++) {
				System.out.print(niz[red][kolone] + "  ");
			}
			System.out.println();
		}
		// pravimo niz lok u koji smjestamo lokaciju koju nam vraca metoda
		int[] lok = locateLargest(niz);
		System.out.println("Lokacija najveceg elementa u nizu je :[" + lok[0] + "]  [" + lok[1] + "]");
		input.close();
	}

}
