package zadaci_06_02_2016;

public class TestTime {

	public static void main(String[] args) {
		// Write a test program that creates two Time objects (using new Time()
		// and new
		// Time(555550000)) and displays their hour, minute, and second in the
		// format
		// hour:minute:second.

		Time sad = new Time();
		System.out.println("Vrijeme je : " + sad.getHours() + " : " + sad.getMinute() + " : " + sad.getSecond());
		Time prije = new Time(555550000);
		System.out.println(
				"Prije vrijeme je: " + prije.getHours() + " : " + prije.getMinute() + " : " + prije.getSecond());
	}

}
