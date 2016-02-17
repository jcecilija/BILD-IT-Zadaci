package zadaci_16_02_2016;

import java.net.MalformedURLException;
import java.util.Scanner;

public class BrojacRijeci {

	public static void main(String[] args) {
		// (Count words) Write a program that counts the number of words in
		// President
		// Abraham Lincoln’s Gettysburg address from
		// http://cs.armstrong.edu/liang/data/
		// Lincoln.txt

		// dodjeljujemo direktno trazenu adresu urlstringu
		String URLString = "https://www.armstrong.edu/academic-departments/cs-it";
		// pokusavamo sa try
		try {
			// kreiramo url objekat
			java.net.URL url = new java.net.URL(URLString);
			// postavljamo brojac na nula
			int count = 0;
			// kreiramo skener objekat
			Scanner input = new Scanner(url.openStream());
			// uslov dok citamo fajl dokle ima jos
			while (input.hasNext()) {
				// dodjeljujemo rijec da je input.next mada nigdje to ne
				// koristimo ali eto moze a i ne mora
				//String rijec = input.next();
				// brojac se inkrementira svaki put na input.next()
				count++;
			} // ispis
			System.out.println("Broj rijeci na ovoj stranici je: " + count);
			// zatvaramo skener
			input.close();
		} // hvatanje greske ako npr adresa nije dobro napisana i ispis
		catch (MalformedURLException ex) {
			ex.printStackTrace();
		} // hvatanje greske kod I/O i ispis
		catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}