package zadaci_17_02_2016;

import java.util.ArrayList;

public class IzmjesajArray {

	public static void shuffle(ArrayList<Number> list) {
		// sa for petljom prolazimo kroz listu
		for (int i = 0; i < list.size(); i++) {
			// postavljamo da je privremena vrijednost vrijednost na indexu i
			Number temp = list.get(i);
			// pravimo slucajnu poziciju neku koju dobijemo kada sa math random
			// dobijemo neki index od nase liste
			int slucajnaPozicija = (int) (Math.random() * list.size());
			// i sada zamijenimo it u poziciju sa slucajnom pozicijom
			list.set(i, list.get(slucajnaPozicija));
			// pa onda slucajnu poziciju sa privremenom pozicijom
			list.set(slucajnaPozicija, temp);
		}
	}

	public static void main(String[] args) {
		// (Shuffle ArrayList) Write the following method that shuffles an
		// ArrayList of
		// numbers:

		// kreiramo arry listu sa brojevima
		ArrayList<Number> list = new ArrayList<Number>();
		// napunimo listu sa 20 brojeva
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		// dodamo u listu i malo double vrijednosti
		list.add(4.6);
		list.add(9.3);
		list.add(1.5);
		// ispis prije mjesanja
		System.out.println("Nasa lista prije mjesanja je: ");
		for (Number a : list) {
			System.out.print(a + " ");
		}
		// ispis poslije mjesanja
		System.out.println();
		// pozivamo metodu
		shuffle(list);
		System.out.println("Nasa lista poslije mjesanja je: ");
		for (Number a : list) {
			System.out.print(a + " ");
		}
	}
}
