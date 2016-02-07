package zadaci_06_02_2016;

public class TestMyPoint {

	public static void main(String[] args) {
		// Write a test program that creates the two points (0, 0) and (10,
		// 30.5) and displays the
		// distance between them.

		// sa no arg konstruktorom kreiramo objekat tacku a sa koordinatama 0,0
		MyPoint a = new MyPoint();
		// kreiramo tacku b
		MyPoint b = new MyPoint(10, 30.5);
		// ispis i poziv metode nad ova dva objekta
		System.out.println("Razlika izmedju a i b je: " + a.distance(b));

	}
}
