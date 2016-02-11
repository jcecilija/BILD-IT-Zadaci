package zadaci_10_02_2016;

public class Facolty extends Employee {
	// A faculty member has office hours and a rank

	// data filds
	private double Sati;
	private String Rank;

	// no arg constructor
	Facolty() {

	}

	// konstruktor sa data fildsima
	Facolty(String name, String adresa, String brojTel, String email, String ured, double plata, double Sati,
			String Rank) {
		super(name, adresa, brojTel, email, ured, plata);
		this.Sati = Sati;
		this.Rank = Rank;
	}

	// metoda za ispis
	public String toString() {
		return "Ime fakulteta je : " + getName();
	}

	// getesi za data filds
	public double getSati() {
		return Sati;
	}

	public String getRank() {
		return Rank;
	}
}
