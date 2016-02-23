package zadaci_22_02_2016;

public class Treci {

	// metoda
	public static double sum(int i) {
		// ako je i =1 vrati jedan
		if (i == 1)
			return 1;
		else
			// a do tad sve metoda poziva samu sebe i sabire
			return (double) 1 / i + sum(i - 1);
	}

	public static void main(String[] args) {
		// (Sum series) Write a recursive method to compute the following
		// series:
		// m(i) = 1 + 1/2 + 1/3 +......+1/i
		// Write a test program that displays m(i) for i = 1, 2, . . ., 10

		// sa for petljom ispisujemo i pozivamo metodu za i od 1 do 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(sum(i));

		}
	}
}