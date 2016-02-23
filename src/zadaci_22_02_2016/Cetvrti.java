package zadaci_22_02_2016;

public class Cetvrti {

	// rekurzivna metoda
	public static double sum(int i) {
		// ovo je uslov kad ce nam se zaustavit samu sebe da poziva
		if (i == 1)
			return (double) i / 3;
		else
			// vraca rezultat tako sto sabira i ponovo se poziva sa i-1
			return (double) i / (2 * i + 1) + sum(i - 1);
	}

	public static void main(String[] args) {
		// (Sum series) Write a recursive method to compute the following
		// series:
		// m(i) =1/3+2/5+3/7+4/9+5/11+6/13+...+1/2i+1;
		// Write a test program that displays m(i) for i = 1, 2, . . ., 10.

		// sa for stampanje i pozivanje metode za i 0d 1 do 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(sum(i));
		}
	}
}