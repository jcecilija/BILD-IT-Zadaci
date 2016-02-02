package zadaci_02_02_2016;

public class CountSingleDigits {

	public static void main(String[] args) {
		// (Count single digits) Write a program that generates 100 random
		// integers between
		// 0 and 9 and displays the count for each number. (Hint: Use an array
		// of ten integers,
		// say counts, to store the counts for the number of 0s, 1s, ..., 9s.)

		// napravimo jedan niz sa brojevima od 0 do 9
		int[] array = new int[10];
		// sa for petljom 100 puta nasumicno generisemo broj od 0 do 9
		for (int i = 0; i < 100; i++) {
			// pomocu math random metode
			int broj = (int) (Math.random() * 10);
			// posto nam je i niz sa indeksima istim kao i brojevi koje
			// generisemo onda kako koji broj generisemo tako povecavamo broj na
			// tom indexu niza
			array[broj]++;
		}
		// sa for petljom prolazimo kroz array i ispisujemo koliko se puta koji
		// broj ponovio
		for (int i = 0; i < array.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + array[i] + " puta");
		}
	}

}
