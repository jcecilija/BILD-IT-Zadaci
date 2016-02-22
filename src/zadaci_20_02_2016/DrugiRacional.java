package zadaci_20_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DrugiRacional extends Number implements Comparable<DrugiRacional> {

	// (Use BigInteger for the Rational class) Redesign and implement the
	// Rational class in Listing 13.13 using BigInteger for the numerator and
	// denominator.

	// inicijalizacija numeratora i denominatora
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");

	// konstruktor za racionalan broj sa defaultnim vrijednostima
	public DrugiRacional() {
	}

	// konstruktor za racionalan broj sa zadanim vrijednostima
	public DrugiRacional(BigInteger numerator, BigInteger denominator) {
		// te vrijednost prosljedjujemo u metodu za nzd
		BigInteger gcd = numerator.gcd(denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE : new BigInteger("-1"))
				.multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}

	// metoda za najveci zajednicki djelilac
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger d1 = d.abs();
		BigInteger gcd = BigInteger.ONE;
		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(d1) <= 0; k = k.add(BigInteger.ONE)) {
			if (n1.remainder(k).equals(BigInteger.ZERO) && d1.remainder(k).equals(BigInteger.ZERO)) {
				gcd = k;
			}
		}
		return gcd;
	}

	// geter za numerator
	public BigInteger getNumerator() {
		return numerator;
	}

	// geter za denominator vraca nam denominatro kao bigInteger tip
	public BigInteger getDenominator() {
		return denominator;
	}

	// metoda koja sabira dva racionalna broja
	public DrugiRacional add(DrugiRacional secondRacional) {
		BigInteger n = numerator.multiply(secondRacional.getDenominator())
				.add(denominator.multiply(secondRacional.getNumerator()));
		BigInteger d = denominator.multiply(secondRacional.getDenominator());
		return new DrugiRacional(n, d);
	}

	// oduzimanje dva razlomka
	public DrugiRacional subtract(DrugiRacional secondRacional) {
		BigInteger n = numerator.multiply(secondRacional.getDenominator())
				.subtract(denominator.multiply(secondRacional.getNumerator()));
		BigInteger d = denominator.multiply(secondRacional.getDenominator());
		return new DrugiRacional(n, d);
	}

	// mnozenje dva razlomka
	public DrugiRacional multiply(DrugiRacional secondRacional) {
		BigInteger n = numerator.multiply(secondRacional.getNumerator());
		BigInteger d = denominator.multiply(secondRacional.getDenominator());
		return new DrugiRacional(n, d);
	}

	// dijeljenje objekata kao razlomaka
	public DrugiRacional divide(DrugiRacional secondRacional) {
		BigInteger n = numerator.multiply(secondRacional.getDenominator());
		BigInteger d = denominator.multiply(secondRacional.getNumerator());
		return new DrugiRacional(n, d);
	}

	// metoda za ispis
	public String toString() {
		if (denominator.equals(BigInteger.ONE)) {
			return numerator + "";
		} else
			return numerator + "/" + denominator;
	}

	// overajdana equals metoda iz object klase
	public boolean equals(Object other) {
		if ((this.subtract((DrugiRacional) other)).getNumerator().compareTo(BigInteger.ZERO) == 0) {
			return true;
		} else
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
		BigDecimal num = new BigDecimal(numerator);
		BigDecimal den = new BigDecimal(denominator);
		return num.divide(den).doubleValue();
	}

	// Implementacija abstract longValue methode iz klase Number
	public long longValue() {
		return (long) doubleValue();
	}

	// Implementacija compareTo methode
	public int compareTo(DrugiRacional o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;
	}
}
