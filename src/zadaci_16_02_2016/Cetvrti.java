package zadaci_16_02_2016;

import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		// (Process scores in a text file on the Web) Suppose that the text file
		// on the
		// Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
		// unspecified number
		// of scores. Write a program that reads the scores from the file and
		// displays their
		// total and average. Scores are separated by blanks.

		// dodjeljujemo direktno trazenu adresu urlstringu
		String URLString = "http://cs.armstrong.edu/liang/data/Scores.txt";
		// pokusavamo sa try
		try {
			// kreiramo url objekat
			java.net.URL url = new java.net.URL(URLString);
			// postavljamo sumu kao total na nula
			int total = 0;
			// inicijalizujemo brojac
			int counter = 0;
			// kreiramo skener objekat
			Scanner input = new Scanner(url.openStream());
			// uslov dok citamo fajl dokle ima jos
			while (input.hasNext()) {
				// suma je jednaka suma plus svaki sljedeci double broj
				total += input.nextDouble();
				// inkrementiramo brojac
				counter++;
			}
			// zatvaramo skener
			input.close();
			// double prosjek racunamo
			double prosjek = total / counter;
			// ispis
			System.out.println("suma je : " + total + " a prosjek je : " + prosjek);
		} // hvatanje greske
		catch (Exception e) {
			// i ispis greske
			System.out.println(e);
		}
	}
}
