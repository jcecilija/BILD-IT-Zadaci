package zadaci_30_01_2016;

//importujemo java util Date klasu
import java.util.Date;

public class DatumIvrijeme {
	public static void Vrijeme() {
		// napravimo objekat te klase
		Date danas = new Date();
		// ispisemo objekat koji je tacno dan, mjesec,tacno vrijeme i godina
		System.out.println(danas);

	}

	public static void main(String[] args) {
		// Napisati metodu koja vraća datum i trenutačno vrijeme.

		// poziv metode koja nam vraca i ispisuje vrijeme i datum
		Vrijeme();
	}
}
