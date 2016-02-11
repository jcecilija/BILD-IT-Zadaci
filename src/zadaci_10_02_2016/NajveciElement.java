package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NajveciElement {
	// metoda koja se trazi
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0 && list.contains(null)) {
			return null;
		} else
			Collections.sort(list);
		return list.get(list.size() - 1);

	}

	public static void main(String[] args) {
		// (Maximum element in ArrayList) Write the following method that
		// returns the
		// maximum value in an ArrayList of integers. The method returns null if
		// the
		// list is null or the list size is 0.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeve:");
		int counter = 0;
		int broj;
		// kreiramo array listu u koju smjestamo brojeve
		ArrayList<Integer> lista = new ArrayList<Integer>();
		while (counter != 10) {
			broj = input.nextInt();
			lista.add(broj);
			counter++;
		}
		input.close();
		// ispis i poziv metode
		System.out.println("Najveci u nizu je: " + max(lista));
	}
}