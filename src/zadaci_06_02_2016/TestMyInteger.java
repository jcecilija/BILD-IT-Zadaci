package zadaci_06_02_2016;

public class TestMyInteger {

	public static void main(String[] args) {
		// Write a client program that tests all methods in the class

		MyInteger prvi = new MyInteger(5);
		System.out.println("vrijednost: " + prvi.getValue() + " je paran: " + prvi.isEven() + " je neparan: "
				+ prvi.isOdd() + " je prost: " + prvi.isPrime());

		MyInteger drugi = new MyInteger(4);
		String broj = "3";
		System.out.println("Da li su isti: " + drugi.equals(broj));
		System.out.println("Dva objekta prvi i drugi da li su isti: " + drugi.equals(prvi));
		
	}

}
