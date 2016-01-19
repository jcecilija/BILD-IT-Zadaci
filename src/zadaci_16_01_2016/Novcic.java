package zadaci_16_01_2016;

import java.util.Scanner;

public class Novcic {

	public static void BacanjeNovcica(int broj) {// metoda
		int pismo = 0;// brojac za pismo na nula
		int glava = 0;// brojac za glava na nula
		int brojac = 1;// brojac bacanja
		while (brojac < broj) {// dokle god je brojac bacanja manji od broja
								// koliko smo rekli da zelimo bacanja
			int novcic = (int) (Math.random() * 2);// simulacija bacanja novcica
			brojac++;// povecavamo broj bacenih novcica za jedan
			if (novcic == 0) {// uslov ako je baceni novcic jednak nula stavimo
								// da je to pismo
				pismo++;// i povecavamo broj pisma za jedan
			}
		} // ispis
		System.out.println("Od ukupno " + broj + " bacanja, pismo je " + pismo + " a glava " + (broj - pismo));
	}

	public static void main(String[] args) {
		// Napisati metodu koja prima jedan argument te simulira bacanje novčića
		// toliko puta. Nakon što se simulacija završi, program ispisuje koliko
		// puta je novčić pokazao glavu a koliko puta pismo.

		Scanner input = new Scanner(System.in);
		System.out.println("Koliko puta zelite da bacite novcic?");
		int broj = input.nextInt();
		// pozivamo metodu
		BacanjeNovcica(broj);

	}

}
