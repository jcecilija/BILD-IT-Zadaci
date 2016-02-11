package zadaci_10_02_2016;

public class Person {
	// A person has a name, address, phone number, and email address
	private String name;
	private String adresa;
	private String brojTel;
	private String email;

	// no arg constructor
	public Person() {

	}

	// konstruktor sa data fildsima
	public Person(String name, String adresa, String brojTel, String email) {
		this.name = name;
		this.adresa = adresa;
		this.brojTel = brojTel;
		this.email = email;
	}

	// geteri
	public String getName() {
		return name;
	}

	public String getAdresa() {
		return adresa;
	}

	public String getBrojTel() {
		return brojTel;
	}

	public String getEmail() {
		return email;
	}

	// metoda za ispis
	public String toString() {
		return "Osoba : " + name;
	}

}
