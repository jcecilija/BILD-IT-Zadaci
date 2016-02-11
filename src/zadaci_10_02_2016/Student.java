package zadaci_10_02_2016;

class Student extends Person {
	// A student has a class status (freshman,
	// sophomore, junior, or senior). Define the status as a constant
	private static final String[] statusi = { "freshman", "sophmore", "junior", "senior" };
	private String status = statusi[0];

	// no arg constructor
	Student() {
	}

	// konstruktor sa data fildsima
	Student(String name, String address, String phoneNumber, String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = statusi[status];
	}

	// metoda za ispis
	public String toString() {
		return "Student: " + getName();
	}

	// geter
	String getStatus() {
		return status;
	}

}
