package zadaci_15_01_2016;

import java.util.ArrayList;

public class NajvecaVrijednost {

	public static Integer max(ArrayList<Integer> list) {
		// postavljamo kao najvecu vrijednost na 0
		int najveci = 0;
		// sada ispitujemo da li je lista null i da li je prazna tj da sadrzi 0
		// elemenata
		if ((list == null) || (list.isEmpty())) {
			// ukoliko su ispunjena ova dva uslova onda vraca null metoda
			return null;
		}
		// u suprotnom prolazimo kroz cijelu listu i trazimo najvecu vrijednost
		// u listi tj poredimo svaki broj sa najvecim,ukoliko je taj veci od
		// najveceg onda on postaje najveci
		else {
			for (int i : list) {
				if (i > najveci) {
					najveci = i;
				}
			}
			return najveci;
		}
	}

	public static void main(String[] args) {
		// Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu
		// Integera. Metoda vraća null ukoliko je lista null iil ukoliko lista
		// sadrži 0 elemenata.

		// kreiramo praznu ArrayListu
		ArrayList<Integer> list = new ArrayList<Integer>();
		// pozovemo metodu nad praznom listu i vrati nam null
		System.out.println(max(list));
		// sada dodamo brojeve u listu
		list.add(9);
		list.add(8);
		list.add(124);
		list.add(0);
		list.add(2);
		list.add(125);

		// pozovemo metodu nad listom kojoj smo dodali prethodne brojeve i
		// ispisemo najveci medju njima kojeg nam vraca metoda
		System.out.println(max(list));

	}

}