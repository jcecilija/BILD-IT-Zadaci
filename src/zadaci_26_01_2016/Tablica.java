package zadaci_26_01_2016;

public class Tablica {

	public static void main(String[] args) {
		// Pretpostavimo da se registarska tablica za auto sastoji od tri
		// uppercase karaktera i 4 broja u sljedećem formatu AAA-1234. Napisati
		// program koji nasumično generiše tablicu.

		// napravimo niz charova u koji smjestamo nasumicno sa math.random
		// metodom velika slova koja dobijemo pomocu ascii koda
		char[] tablica = new char[4];
		// prva tri slova su velika slova
		tablica[0] = ((char) (Math.random() * 10 + 81));
		tablica[1] = (char) (Math.random() * 10 + 81);
		tablica[2] = (char) (Math.random() * 10 + 81);
		// a za cetvrto mjesto nam treba crtica
		tablica[3] = (char) (45);
		// sa for petljom ispisujemo sto smo dobili
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i]);
		}
		// sa drugom for petljom generisemo nasumicno preostale 4 cifre a
		// trebaju nam brojeve od 1 do 9
		for (int i = 0; i < 4; i++) {
			// i ispisujemo svaki u istom redu
			System.out.print((int) (Math.random() * 10));
		}
	}
}
