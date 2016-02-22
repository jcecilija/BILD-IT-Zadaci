package zadaci_20_02_2016;

public class Rational extends Number implements Comparable<Rational> {

	// (Demonstrate the benefits of encapsulation) Rewrite the Rational class in
	// Listing 13.13 using a new internal representation for the numerator and
	// denominator. Create an array of two integers as follows:
	// private long[] r = new long[2];
	// Use r[0] to represent the numerator and r[1] to represent the
	// denominator.
	// The signatures of the methods in the Rational class are not changed, so a
	// client
	// application that uses the previous Rational class can continue to use
	// this new
	// Rational class without being recompiled.

	// inicijalizacija numeratora r[0] i denominatora r[1]
	private long[] r = new long[2];

	// konstruktor za racionalan broj sa defaultnim vrijednostima
	public Rational() {
		this(0, 1);
	}

	// konstruktor za racionalan broj sa zadanim vrijednostima
	public Rational(long numerator, long denominator) {
		// te vrijednost prosljedjujemo u metodu za nzd
		long gcd = gcd(numerator, denominator);
		r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[1] = Math.abs(denominator) / gcd;
	}

	// metoda za najveci zajednicki djelilac
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}

	// geter za numerator, vraca nam r[0] jer je on u nasem nizu broj koji
	// dijelimo
	public long getNumerator() {
		return r[0];
	}

	// geter za denominator vraca nam r[1] jer je on broj sa kojim djelimo
	public long getDenominator() {
		return r[1];
	}

	// metoda koja sabira dva racionalna broja
	public Rational add(Rational secondRational) {
		// long n ce biti novi numerator a dobijamo ga po formuli
		long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
		// long d ce biti denominator a dobija se po formuli
		long d = r[1] * secondRational.getDenominator();
		// metoda vraca kao rezultat poziv metode koja racuna racionalni broj
		// ali sa ova dva sada nova numerator i denominator
		return new Rational(n, d);
	}

	// oduzimanje dva razlomka
	public Rational subtract(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		// metoda vraca kao rezultat poziv metode koja racuna racionalni broj
		// ali sa ova dva sada nova numerator i denominator
		return new Rational(n, d);
	}

	// mnozenje dva razlomka
	public Rational multiply(Rational secondRational) {
		// po formuli za racunanje razlomaka dobijamo novi numerator i
		// denominator koje prosljedjujemo metodi rational
		long n = r[0] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		// metoda vraca kao rezultat poziv metode koja racuna racionalni broj
		// ali sa ova dva sada nova numerator i denominator
		return new Rational(n, d);
	}

	// dijeljenje razlomaka
	public Rational divide(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator();
		long d = r[1] * secondRational.r[0];
		// metoda vraca kao rezultat poziv metode koja racuna racionalni broj
		// ali sa ova dva sada nova numerator i denominator
		return new Rational(n, d);
	}

	// metoda za ispis
	public String toString() {
		if (r[1] == 1)
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}

	// overajdana equals metoda iz object klase
	public boolean equals(Object other) {
		if ((this.subtract((Rational) (other))).getNumerator() == 0)
			return true;
		else
			return false;
	}

	// implemantacija abstract intValue methode iz klase Number
	public int intValue() {
		return (int) doubleValue();
	}

	// Implementacija abstract floatValue methode iz klase Number
	public float floatValue() {
		return (float) doubleValue();
	}

	// Implementacija doubleValue methode iz klase Number
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}

	// Implementacija abstract longValue methode iz klase Number
	public long longValue() {
		return (long) doubleValue();
	}

	// Implementacija compareTo methode
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}

}
