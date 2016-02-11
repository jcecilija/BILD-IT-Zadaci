package zadaci_10_02_2016;

public class TestDrugiZadatak {

	public static void main(String[] args) {
		// Write a test program that creates a Person, Student, Employee,
		// Faculty, and Staff, and
		// invokes their toString() methods.
		// kreiramo person objekat
		Person person = new Person("Ceca", "Kakmuz", "066000111", "ceca@hotmail.com");
		// objekat klase student
		Student student = new Student("Danilo", "Kakmuz/Petrovo", "066789987", "danilo@yahoo.com", 2);
		// objekat klase employee
		Employee zaposlenik = new Employee("Vojo", "Petrovoc", "065111222", "vojo@vojo", "limex", 500);
		// objekat klase facolty
		Facolty fakultet = new Facolty("Mica", "Petrovo", "053232121", "mica@mici", "pcelinjak", 300.00, 5.0, "radnik");
		// objekat klase staff
		Staff staff = new Staff("VEdran", "Doboj", " 061444555", "vedran@veki", "josjak 67", 900.0, "vodja");

		// ispis
		System.out.println(person);
		System.out.println(student);
		System.out.println(zaposlenik);
		System.out.println(fakultet);
		System.out.println(staff);

	}

}
