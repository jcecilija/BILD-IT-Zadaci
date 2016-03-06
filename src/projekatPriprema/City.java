package projekatPriprema;

public class City {
	// atributi
	int ID;
	String Name;
	String CountryCode;
	String District;
	long Population;

	// no arg konstruktor
	City() {
	}

	// konstruktor sa zadanim vrijednostima
	City(int ID, String Name, String CountryCode, String District, long Population) {
		this.ID = ID;
		this.Name = Name;
		this.CountryCode = CountryCode;
		this.District = District;
		this.Population = Population;
	}

	// geteri
	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getDistrict() {
		return District;
	}

	public long getPopulation() {
		return Population;
	}

	public void toPrint() {
		System.out.println("ID " + this.getID() + " Name " + this.getName() + " CountryCode " + this.getCountryCode()
				+ " district " + this.getDistrict() + " population " + this.getPopulation());

	}
}