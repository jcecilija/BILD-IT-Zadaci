package zadaci_27_01_2016;

import java.util.Scanner;

public class PoredjenjeCijena {

	// metoda koja nam vraca iznos po jedinici mjere proizvoda
	public static double cijena(double tezina, double cijena) {
		// dijelimo cijenu sa tezinom i dobijamo iznos koji cemo poslije da
		// poredimo
		double iznos = cijena / tezina;
		// metoda vraca iznos
		return iznos;
	}

	public static void main(String[] args) {
		// Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva
		// različita pakovanja. Želimo napisati program koji upoređuje cijene ta
		// dva pakovanja. Program pita korisnika da unese težinu i cijenu oba
		// pakovanja te ispisuje koje pakovanje ima bolju cijenu.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite tezinu i cijenu za prvi slucaj:");
		// smjestamo tezinu i cijenu za prvi slucaj
		double prviTezina = input.nextDouble();
		double prviCijena = input.nextDouble();
		// pozivamo metodu da racuna iznos i smjestamo u cijenu za prvi slucaj
		double cijenaPrvog = cijena(prviTezina, prviCijena);
		// ispis
		System.out.println("Unesite tezinu i cijenu za drugi slucaj:");
		// smjetamo tezinu i cijenu za drugi slucaj
		double drugiTezina = input.nextDouble();
		double drugiCijena = input.nextDouble();
		// pozivamo metodu da racunamo cijenu za drugi slucaj
		double cijenaDrugog = cijena(drugiTezina, drugiCijena);
		// uslov ako je cijenaPrvog manja od cijeneDrugog onda je prvo pakovanje
		// jeftinije i ima bolju cijenu za kupca tj jeftinije je
		if (cijenaPrvog < cijenaDrugog) {
			System.out.println("Bolju cijena ima prvo pakovanje!");
			// uslov ako je ispunjen onda je jeftiniji drugo pakovanje tj ima
			// bolju cijenu za kupca tako sam razumila ja bolju cijenu, bolje mi
			// je ako je nesto jeftinije
		} else if (cijenaPrvog > cijenaDrugog) {
			System.out.println("Bolju cijena ima drugo pakovanje");
		} else
			// ispis
			System.out.println("Ista im je cijena");
		input.close();
	}
}
