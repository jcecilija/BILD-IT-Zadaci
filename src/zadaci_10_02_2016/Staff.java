package zadaci_10_02_2016;

public class Staff extends Employee {
	// A staff member has a title
	private String title;

	// no arg constructor
	Staff() {
	}

	// konstruktor sa data fildsima
	Staff(String name, String adresa, String brojTel, String email, String ured, double plata, String title) {
		super(name, adresa, brojTel, email, ured, plata);
		this.title = title;
	}

	// metoda za ispis
	public String toString() {
		return "Staff : " + getName();
	}

	// geter
	public String getTitle() {
		return title;
	}
}
