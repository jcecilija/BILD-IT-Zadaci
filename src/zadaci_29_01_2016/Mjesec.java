package zadaci_29_01_2016;

public class Mjesec {

	public static void main(String[] args) {
		// Napisati program koji nasumično generiše cijeli broj između 1 i 12 te
		// ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
		// napravimo niz stringova sa mjesecima a na nulto mjesto stavimo prazan
		// string jer nam se u zadatku trazi za januar da je 1
		String[] mjeseci = { " ", "Januar", "februar", " Mart", "April", "Maj", "Jun", "Juli", "Avgust", "Septembar",
				"Oktobar", "Novembar", " Decembar" };
		// sa math random generisemo nasumicno broj izmedju 1 i 12
		int mjesec = (int) (Math.random() * 13);
		// sa for petljom prolazimo kroz niz i poredimo broj sa pozicijom i u
		// tom nizu
		for (int i = 0; i < mjeseci.length; i++) {
			// uslov za ispis kad dodjemo do mjeseca na ondexu a da je to broj
			// koji smo unijeli
			if (mjesec == i)
				// ispis
				System.out.println("Za nasumicno genrisan broj " + mjesec + " odgovarajuci mjesec je " + mjeseci[i]);
		}
	}
}
