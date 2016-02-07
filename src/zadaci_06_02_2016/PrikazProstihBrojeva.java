package zadaci_06_02_2016;

public class PrikazProstihBrojeva {

	public static void main(String[] args) {
		// (Displaying the prime numbers) Write a program that displays all the
		// prime
		// numbers less than 120 in decreasing order. Use the StackOfIntegers
		// class
		// to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and
		// display them in reverse order

		// kreiramo stek na koji cemo smjes
		StackOfIntegers stek = new StackOfIntegers();
		for (int i = 2; i <= 120; i++) {
			// postavljamo boolean na true
			boolean prost = true;
			// sa drugom for petljom pronalazimo prost broj
			for (int j = 2; j <= i / 2; j++) {
				// ako je broj djeljiv sa nekim brojem onda nije prost
				if (i % j == 0) {
					// i prost postaje false
					prost = false;
					// prekida se petlja
					break;
				}
			} // uslov ako je broj prost smjestamo ga na stek
			if (prost)
				stek.push(i);
		} // ispis
		System.out.println("Prosti brojevi su :");
		// uslov dokle god na steku ima nesto
		while (!stek.empty())
			// ispisuj a sa steka se ispisuje first in last out
			System.out.print(stek.pop() + " ");
	}
}