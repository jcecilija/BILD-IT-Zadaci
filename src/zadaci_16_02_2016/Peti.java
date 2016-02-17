package zadaci_16_02_2016;

public class Peti {
	// metoda sa kojom dobijamo visinu plate u zavisnosti od pozicije
	public static double[] RankListaPlate(String pozicija) {
		// asistant ima platu 50 000 - 80 000
		if (pozicija == "assistant") {
			// vrati nizu od 50 do 80 hiljada
			return new double[] { 50000, 80000 };
		}
		// associate ima platu 60 000 - 110 000
		else if (pozicija == "associate") {
			// vrati niz od 60 do 110 hiljada
			return new double[] { 60000, 110000 };
		}
		// full ima platu 75 000 - 130 000
		else if (pozicija == "full") {
			// vrati niz od 75 do 130 hiljada
			return new double[] { 75000, 130000 };
		} else
			// ako nema te pozicije vrati null
			System.out.println("Nema te pozicije");
		return null;
	}

	public static void main(String[] args) {
		// (Create large dataset) Create a data file with 1,000 lines. Each line
		// in the file
		// consists of a faculty member’s first name, last name, rank, and
		// salary. The
		// faculty member’s first name and last name for the ith line are
		// FirstNamei and
		// LastNamei. The rank is randomly generated as assistant, associate,
		// and full.
		// The salary is randomly generated as a number with two digits after
		// the decimal
		// point. The salary for an assistant professor should be in the range
		// from 50,000
		// to 80,000, for associate professor from 60,000 to 110,000, and for
		// full professor
		// from 75,000 to 130,000. Save the file in Salary.txt. Here are some
		// sample data:
		// FirstName1 LastName1 assistant 60055.95
		// FirstName2 LastName2 associate 81112.45

		// FirstName1000 LastName1000 full 92255.21

		// kreiramo fajl
		try {
			java.io.File file = new java.io.File("Salary.txt");
			// ukoliko fajl postoji vec ispisi i izadji
			if (file.exists()) {
				System.out.println("File already exists");
				System.exit(1);
			}
			// kreiramo printwriter
			java.io.PrintWriter output = new java.io.PrintWriter(file);
			// kreiramo niz u koji smjetamo pozicije
			String[] pozicija = { "assistant", "associate", "full" };
			for (int i = 1; i <= 1000; i++) {
				// kreiramo prazan string kao liniju u fajlu koja ce da sadrzi
				// podatke o i-tom clanu fakulteta
				String clanFakulteta = "";
				// dodajemo mu ime
				clanFakulteta += "firstName" + i;
				// prezime
				clanFakulteta += "lastName" + i;
				// i poziciju na osnovu velicine plate
				clanFakulteta += "" + pozicija[(int) (Math.random() * (3))];
				// upisujemo sve u fajl
				output.print(clanFakulteta);
			}
			// zatvaramo print writer
			output.close();
		} // hvatanje greske i ispis
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}