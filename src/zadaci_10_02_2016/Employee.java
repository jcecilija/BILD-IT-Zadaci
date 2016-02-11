package zadaci_10_02_2016;

public class Employee extends Person {
	// An employee has an office, salary, and date hired.

	private String ured;
	private double plata;

	Employee() {
	}

	Employee(String name, String adresa, String brojTel, String email, String ured, double plata) {
		super(name, adresa, brojTel, email);
		this.ured = ured;
		this.plata = plata;

	}

	public String toString() {
		return "Ime radnika je: " + getName();
	}

	public String getUred() {
		return ured;
	}

	public double getPlata() {
		return plata;
	}
}
