package zadaci_19_02_2016;

public class Course {

	// (Enable the Course class cloneable) Rewrite the Course class in Listing
	// 10.6
	// to add a clone method to perform a deep copy on the students field.
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
	}

	// metoda koja se trazi da se doda na zadatak iz knjige
	// kreira se objekat kloniran objekat sa imenom kursa
	// sa for petljom prolazimo kroz niz studenata i svakog kloniramo i vracamo
	// kloniran
	public Object kloniraj() {
		Course kloniran = new Course(this.courseName);
		for (int i = 0; i < this.students.length; i++) {
			kloniran.students[i] = this.students[i];
		}
		return kloniran;
	}
}
