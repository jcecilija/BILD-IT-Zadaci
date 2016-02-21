package zadaci_19_02_2016;

public class DrugiTest {

	public static void main(String[] args) {
		// Kreiramo dva pravougaonika i override metodu koja poredi njihove
		// povrsine

		Rectangle r1 = new Rectangle(2, 4);
		Rectangle r2 = new Rectangle(4, 2);
		System.out.println("Jednakost ova dva pravougaonika je: " + r1.equals(r2));
	}

}
