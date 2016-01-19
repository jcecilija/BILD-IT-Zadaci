package zadaci_19_01_2016;

public class Karte {

	public static void main(String[] args) {
		// Napisati program koji simulira nasumično izvlačenje karte iz špila od
		// 52 karte. Program treba ispisati koja karta je izvučena (A, 2, 3, 4,
		// 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce,
		// Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku
		// kocke.

		// jedan niz koji ce sadrzat sve karte
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// a drugi niz koji sadrzi sve znake
		String[] znak = { "Srce", "Pik", "Djetelina", "Kocka" };
		// sa Math.random nasumicno dobijamo broj koji ce odgovorat nekom broju
		// karte i znaku koji ispisujemo
		System.out.print("Karta koju ste izvukli je:  ");
		System.out.print(karte[(int) (Math.random() * 13)] + " u znaku  ");
		System.out.println(znak[(int) (Math.random() * 4)]);

	}
}
