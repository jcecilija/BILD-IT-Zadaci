package zadaci_19_02_2016;

public class PrviTest {

	public static void main(String[] args) {
		// kreiramo dva kruga sa radijusima 3.2 i 3.3 i ispisujemo da li su
		// jednaki

		Circle c1 = new Circle(3.2);
		Circle c2 = new Circle(3.3);
		System.out.println("Krug c1 i c2 su jednaki: " + c1.equals(c2));

	}

}
