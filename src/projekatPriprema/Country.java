package projekatPriprema;

public class Country {
	// data filds te klase odnosno sve ono sto se nalazi u tabeli country
	String Code;
	String Name;
	String Continent;
	String Region;
	double SurfaceArea;
	int IndepYear;
	long Population;
	double LifeExpectancy;
	double GNP;
	String LocalName;
	String GovernmentFrom;
	String HeadOfState;
	int Capital;
	String Code2;

	// no arg konstruktor
	public Country() {

	}

	// konstruktor sa zadanim vrijednostima
	public Country(String Code, String Name, String Continent, String Region, double SurfaceArea, int IndepYear,
			long Population, double LifeExpectancy, double GNP, String LocalName, String GovernmentFrom,
			String HeadOfState, int Capital, String Code2) {
		this.Code = Code;
		this.Name = Name;
		this.Continent = Continent;
		this.Region = Region;
		this.SurfaceArea = SurfaceArea;
		this.IndepYear = IndepYear;
		this.Population = Population;
		this.LifeExpectancy = LifeExpectancy;
		this.GNP = GNP;
		this.LocalName = LocalName;
		this.GovernmentFrom = GovernmentFrom;
		this.HeadOfState = HeadOfState;
		this.Capital = Capital;
		this.Code2 = Code2;

	}

	// geteri za pristupanje podacima klase country
	public String getCode() {
		return Code;
	}

	public String getName() {
		return Name;
	}

	public String getContinent() {
		return Continent;
	}

	public String getRegion() {
		return Region;
	}

	public double getSurfaceArea() {
		return SurfaceArea;
	}

	public int getIndepYear() {
		return IndepYear;
	}

	public long getPopulation() {
		return Population;
	}

	public double getLifeExpectancy() {
		return LifeExpectancy;
	}

	public double getGNP() {
		return GNP;
	}

	public String getLocalName() {
		return LocalName;
	}

	public String getGovernmentFrom() {
		return GovernmentFrom;
	}

	public String getHeadOfState() {
		return HeadOfState;
	}

	public int getCapital() {
		return Capital;
	}

	public String getCode2() {
		return Code2;
	}

	public void toPrint() {
		System.out.println("Code " + this.Code + " Name " + this.Name + " Continent " + this.Continent + " Region "
				+ this.Region + " SurfaceArea " + this.SurfaceArea + " IndepYear " + this.IndepYear + " population "
				+ this.Population + " LifeExpectancy " + this.LifeExpectancy + " GNP " + this.GNP + " LocalName "
				+ this.LocalName + " GovernmentFrom " + this.GovernmentFrom + " HeadOfState " + this.HeadOfState
				+ " Capital " + this.Capital + " Code2 " + this.Code2);
	}
}