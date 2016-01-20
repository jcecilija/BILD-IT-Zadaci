package mini1Kalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MojKalendar {

	private int godina;
	private int mjesec;
	private int dan;

	public MojKalendar(int mjesec, int godina) {// konstruktor koji prima mjesec
												// i godinu
		Calendar kalendar = new GregorianCalendar();// pravimo objekat kalendar
		kalendar.set(Calendar.MONTH, mjesec);// nesto sam nasla da treba bit
												// vako
		kalendar.set(Calendar.YEAR, godina);
		setGodina(kalendar.get(Calendar.YEAR));
		setMjesec(kalendar.get(Calendar.MONTH));
	}

	// geteri i seteri za godina,mjesec i dan
	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public int getMjesec() {
		return mjesec;
	}

	public void setMjesec(int mjesec) {
		this.mjesec = mjesec;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void stampajMjesec() {
		// metoda koja stampa komplet mjesec tako sto
		// poziva druge dvije metode

		stampajNaslov(godina, mjesec);
		stampajMjeseckomplet(godina, mjesec);
	}

	// metoda kojom cemo dobit ime mjeseca tako sto joj proslijedimo broj
	// mjeseca
	public String getImeMjeseca(int mjesec) {
		// u niz stavimo imena mjeseci s tim da za nultu poziciju stavimo nista
		// jer mjesec ne moze bit nula
		String[] imeMjeseca = { "", "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "September",
				"Octobar", "Novembar", "Decembar" };
		if (mjesec < 1 || mjesec > 12) {// uslov od kog do kod broja je mjesec
			// ukoliko korisnik unese neki drugi broj ispisati
			System.out.println("Pogresan unos za mjesec");
			System.exit(0);
		}
		return imeMjeseca[mjesec];// metoda vraca ime mjeseca
	}

	// metoda koja stampa naslov
	public void stampajNaslov(int godina, int mjesec) {
		System.out.println("         " + getImeMjeseca(mjesec) + " " + godina);// stampamo
																				// ime
																				// mjeseca
		System.out.println("-----------------------------");// pa liniju
		System.out.println(" Ned Pon Uto Sre Cet Pet Sub");// pa dane u redu
	}

	// metoda za stampanje mjeseca odnosno dana u mjesecu pocev od prvog na
	// mjestu koje odgovara danu u tom mjesecu
	public void stampajMjeseckomplet(int godina, int mjesec) {
		int pocetniDan = getPocetniDan(godina, mjesec);
		int brojDanaUMjesecu = getBrojDanaUMjesecu(godina, mjesec);// koliko
																	// mjesec
																	// ima dana
		int i = 0;
		for (i = 0; i < pocetniDan; i++)
			System.out.print("    ");
		for (i = 1; i <= brojDanaUMjesecu; i++) {
			System.out.printf("%4d", i);
			if ((i + pocetniDan) % 7 == 0)// stampamo sedam dana u redu
				System.out.println();
		}
		System.out.println();
	}

	// metoda koja nam vraca pocetni dan u mjesecu za koji trazimo ispis
	// kalandara
	public int getPocetniDan(int godina, int mjesec) {// metoda prima godinu i
														// mjesec za koji
														// trazimo
		final int START_DAY_FOR_JAN_1_1800 = 3;// nasla da vak treba za prvi dan
		int ukupanBrojDana = getUkupanBrojDana(godina, mjesec);// ukupan broj
																// dana za
																// trazeni
																// mjesec
																// dobijamo sa
																// get
		return (ukupanBrojDana + START_DAY_FOR_JAN_1_1800) % 7;// metoda vraca
																// dan koji je
	}

	public int getUkupanBrojDana(int godina, int mjesec) {
		// metoda kojom nalazimo ukupan broj dana u mjesecu
		int ukupno = 0;
		for (int i = 1800; i < godina; i++) {
			if (isLeapYear(i))// da li je godina prestupna
				ukupno = ukupno + 366;
			else
				ukupno = ukupno + 365;
		}

		for (int i = 1; i < mjesec; i++) {// da bi dobili ukupno dana za trazeni
											// mjesec
			ukupno = ukupno + getBrojDanaUMjesecu(godina, i);
		}
		return ukupno;
	}

	public int getBrojDanaUMjesecu(int godina, int mjesec) {
		// metoda koja nam vraca koliko mjesec ima dana
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7 || mjesec == 8 || mjesec == 10 || mjesec == 12)
			return 31;// uslov za 31 dan
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11)
			return 30;// uslov za 30 dana
		if (mjesec == 2)// uslov da li je prestupna
			return isLeapYear(godina) ? 29 : 28;
		return 0;
	}

	public boolean isLeapYear(int godina) {// metoda koja vraca da li je godina
											// prestupna
		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
	}
}
