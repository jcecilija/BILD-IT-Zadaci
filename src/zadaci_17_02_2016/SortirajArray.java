package zadaci_17_02_2016;

import java.util.ArrayList;

public class SortirajArray {

	public static void sort(ArrayList<Number> list) {
		// inicijalizujemo da je privremeni broj = 0
		Number temp = 0;
		// inicijalizujemo jedan boolean na true
		boolean mijenjanje = true;
		// uslov
		while (mijenjanje) {
			// odmah stavljamo da je false
			mijenjanje = false;
			// sa for petljom prolazimo kroz niz
			for (int i = 0; i < list.size() - 1; i++) {
				// uslov ako je prvi veci od drugog
				if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
					// koristimo privremenu varijablu da smjestimo u nju prvi
					temp = list.get(i);
					// sada sa set zamijenimo na mjesto provog stavimo drugi
					list.set(i, list.get(i + 1));
					// a na mjesto drugog stavimo privremeni
					list.set(i + 1, temp);
					// postavljamo boolean na true
					mijenjanje = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// (Sort ArrayList) Write the following method that sorts an ArrayList
		// of numbers.

		// kreiramo array i napunimo ga
		ArrayList<Number> lista = new ArrayList<Number>();
		for (int i = 0; i < 20; i++) {
			lista.add(Math.random() * i);
		}
		// stampano nesortiranu listu
		System.out.println("Nasa nesortirana lista je:");
		for (Number a : lista) {
			System.out.print(a + " ");
		}
		// novi red
		System.out.println();
		// poziv metode
		sort(lista);
		// stampano sortiranu listu
		System.out.println("Nasa sortirana lista je:");
		for (Number a : lista) {
			System.out.print(a + " ");
		}
	}
}
