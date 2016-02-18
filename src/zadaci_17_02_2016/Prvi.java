package zadaci_17_02_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) throws IOException {
		// (Process large dataset) A university posts its employees’ salaries at
		// http://
		// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
		// consists of a faculty
		// member’s first name, last name, rank, and salary (see Programming
		// Exercise
		// 12.24). Write a program to display the total salary for assistant
		// professors,
		// associate professors, full professors, and all faculty, respectively,
		// and display
		// the average salary for assistant professors, associate professors,
		// full professors,
		// and all faculty, respectively.

		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			// Opens a connection to this URL and returns an InputStream for
			// reading from that connection. This method is a shorthand for:
			// openConnection().getInputStream()
			Scanner input = new Scanner(url.openStream());
			// inicijalizujemo brojace za pozicije profesora
			int brojacAssistant = 0;
			int brojacAssociate = 0;
			int brojacFull = 0;
			// postavimo na nula i plate za pozicije profesora
			double AssistantPlata = 0.0;
			double AssociatePlata = 0.0;
			double FullPlata = 0.0;
			// citamo podatke iz fajla
			while (input.hasNextLine()) {
				// smjestamo komplet sve iz fajla u string niz koji treba da
				// razdvojimo sa razmakom za svakog profresora podatke
				String[] line = input.nextLine().split(" ");
				// pozicija za profesora se nalazi na trecem mjestu u nizu
				String pozicija = line[2];
				// plata se nalazi na cetvrtom mjestu u nizu poslije pozicije
				double plata = Double.parseDouble(line[3]);
				// uslov ako pozicija odgovara assistantu
				if (pozicija.equals("assistant")) {
					// inkrementiramo brojac za njega
					brojacAssistant++;
					// i dodajemo platu
					AssistantPlata += plata;
				} // drugi uslov ako je pozicija associate
				else if (pozicija.equals("associate")) {
					brojacAssociate++;
					AssociatePlata += plata;
				} // treci moguci uslov ako je pozicija full
				else {
					brojacFull++;
					FullPlata += plata;
				}
			}
			// zatvaramo skener
			input.close();
			// suma svih plata
			double totalPlata = AssistantPlata + AssociatePlata + FullPlata;
			// ispis
			System.out.println("Plata svih zaposlenih profesora je: " + totalPlata);
			// suma svih profesora
			int brojProfesora = brojacAssistant + brojacAssociate + brojacFull;
			// ispisi
			System.out.println("Ukupno zaposlenih je : " + brojProfesora);
			System.out.println("Prosjecna plata zaposlenih je : " + totalPlata / brojProfesora);
			System.out.println("Prosjecna plata za Assistanta Je : " + AssistantPlata / brojacAssistant);
			System.out.println("Prosjecna plata za Associate je : " + AssociatePlata / brojacAssociate);
			System.out.println("Prosjecna plata za Full je : " + FullPlata / brojacFull);

		}
		// hvatanje moguce greske da url nije odgovarajuca
		catch (MalformedURLException ex) {
			// ispis
			ex.printStackTrace();
		}
	}
}
