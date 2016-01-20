package zadaci_20_01_2016;

import java.util.Scanner;

public class VrijednostInvesticije {

	public static void main(String[] args) {
		// Napisati program koji učitava iznos investicije, godišnju interesnu
		// stopu i broj godina te vraća buduću vrijednost investicije koristeći
		// se sljedećom formulom: buducaVrijednostInvesticije = iznosInvesticije
		// * (1 + mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko
		// uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu
		// i 1 kao broj godina program vam vraća 1032.98 kao buducu vrijednost
		// investicije.
		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite iznos investicije:");
		// iznos investicije smjetamo
		double iznosInvesticije = input.nextDouble();
		// ispis korisniku
		System.out.println("Unesite godisnju interesnu stopu:");
		// smjestanje unosa
		double godisnjaInteresnaStopa = input.nextDouble();
		// mjesecnu is dobijamo kada godisnju djelimo sa 12
		double mjesecnaInteresnaStopa = godisnjaInteresnaStopa / 12;
		// ispis korisniku
		System.out.println("Unesite broj godina:");
		// unos broja godina
		int brojGodina = input.nextInt();
		// formula za racunanje
		double buducaVrijednostInvesticije = Math.pow(iznosInvesticije * (1 + mjesecnaInteresnaStopa),
				(brojGodina * 12));
		// ispis
		System.out.println("Buduca vrijednost investicije je: " + buducaVrijednostInvesticije);
		input.close();
	}

}
