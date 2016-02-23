package zadaci_22_02_2016;

public class Peti {

	// rekurzivna metoda
	public static double sum(int i) {
		// uslov i da nam prekine pozivanje metode same sebe
		if (i == 1)
			return (double) i / 2;
		else
			// metoda vraca zbir tako sto poziva samu sebe za i-1
			return (double) i / (i + 1) + sum(i - 1);
	}

	public static void main(String[] args) {
		// (Sum series) Write a recursive method to compute the following
		// series:
		// m(i) =1/2+2/3 +i/(i + 1);
		// Write a test program that displays m(i) for i = 1, 2, . . ., 10.

		// poziv i ispis metode uz pomoc fora za brojeve od 1 do 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(sum(i));
		}
	}
}
