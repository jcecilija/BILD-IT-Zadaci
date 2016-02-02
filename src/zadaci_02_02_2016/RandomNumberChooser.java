package zadaci_02_02_2016;

import java.util.Scanner;

public class RandomNumberChooser {

	public static int getRandom(int... numbers) {
		// a + Math.random() * b —-> Vraća nasumičan broj između a i a + b,
		// isključujući a+ b
		int broj = 1 + (int) (Math.random() * 54);
		// sa for petljom poredimo broj koji smo proslijedili i random broj
		for (int i = 0; i < numbers.length; i++) {
			// ukoliko su isti
			if (broj == numbers[i]) {
				// ispisi
				System.out.println("Broj koji ste proslijedili je isti kao i random broj:");
			}
		} // metoda vraca broj izmedju 1 i 54 a da nije to broj koji smo
			// proslijedili
		return broj;

	}

	public static void main(String[] args) {
		// Write a method that returns a random number between
		// 1 and 54, excluding the numbers passed in the argument.

		// skenr da mozemo unijet broj koji ne smije metoda da vrati
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki broj izmedju 1 i 54:");
		// smjestanje broja
		int numbers = input.nextInt();
		// ispis ono sto metoda vraca i poziv metode
		System.out.println(getRandom(numbers));
		input.close();
	}

}
