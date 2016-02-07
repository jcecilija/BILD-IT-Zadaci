package zadaci_06_02_2016;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	// The methods isEven(), isOdd(), and isPrime() that return true if the
	// value in this object is even, odd, or prime, respectively.
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		for (int j = 2; j <= value / 2; j++) {
			// ako je broj djeljiv sa nekim brojem onda nije prost
			if (value % j == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int x) {
		if (x % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int x) {
		for (int j = 2; j <= x / 2; j++) {
			// ako je broj djeljiv sa nekim brojem onda nije prost
			if (x % j == 0)
				return false;
		}
		return true;
	}

	// The static methods isEven(MyInteger), isOdd(MyInteger), and
	// isPrime(MyInteger) that return true if the specified value is even, odd,
	// or prime, respectively.
	public static boolean isEven(MyInteger x) {
		if (x.isEven())
			return true;
		else
			return false;
	}

	public static boolean isOdd(MyInteger x) {
		if (x.isOdd())
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger x) {
		if (x.isPrime())
			return true;
		else
			return false;
	}
	// The methods equals(int) and equals(MyInteger) that return true if
	// the value in this object is equal to the specified value.

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger x) {
		if (this == x) {
			return true;
		}
		return false;
	}
	// A static method parseInt(char[]) that converts an array of numeric
	// characters to an int value

	public static int parseInt(char[] a) {
		return Integer.parseInt(a.toString());
	}

	// A static method parseInt(String) that converts a string into an int
	// value.
	public static int parseInt(String b) {
		return Integer.parseInt(b);
	}

}
