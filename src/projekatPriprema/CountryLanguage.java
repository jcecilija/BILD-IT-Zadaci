package projekatPriprema;

public class CountryLanguage {

	// data filds
	String CountryCode;
	String Language;
	char isOfficial;
	double Percentage;

	// no arg konstruktor
	CountryLanguage() {

	}

	// konstruktor sa zadanim vrijednostima
	public CountryLanguage(String CountryCode, String Language, char isOfficial, double Percentage) {
		this.CountryCode = CountryCode;
		this.Language = Language;
		this.isOfficial = isOfficial;
		this.Percentage = Percentage;
	}

	// geteri za podatke klase jezici
	public String getCountryCode() {
		return CountryCode;
	}

	public String getLanguage() {
		return Language;
	}

	public char getIsOfficial() {
		return isOfficial;
	}

	public double getPercentage() {
		return Percentage;
	}

}