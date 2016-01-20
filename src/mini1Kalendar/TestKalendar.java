package mini1Kalendar;

import java.util.Scanner;

public class TestKalendar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesec");
		int mjesec = input.nextInt();
		System.out.println("Unesite koju godinu");
		int godina = input.nextInt();
		// pozivamo konstruktor u koji prosljedjujemo unijete parametre
		MojKalendar kalendar = new MojKalendar(mjesec, godina);
		// pozivamo metodu za stampanje
		kalendar.stampajMjesec();
		// zatvaranje skenera
		input.close();
	}

}