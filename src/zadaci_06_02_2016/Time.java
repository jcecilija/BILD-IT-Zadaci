package zadaci_06_02_2016;

public class Time {

	private long hours;
	private long minute;
	private long second;

	// A no-arg constructor that creates a Time object for the current time.
	// (The values of the data fields will represent the current time.)
	Time() {
		setTime(System.currentTimeMillis());
	}

	// A constructor that constructs a Time object with a specified elapsed time
	// since midnight, January 1, 1970, in milliseconds. (The values of the data
	// fields will represent this time.)
	public Time(long hours, long minute, long second) {
		this.hours = hours;
		this.minute = minute;
		this.second = second;
	}

	// A constructor that constructs a Time object with the specified hour,
	// minute,
	// and second.
	public Time(long elapseTime) {
		setTime(elapseTime);
	}

	// Three getter methods for the data fields hour, minute, and second,
	// respectively.
	public long getHours() {
		return hours;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	// A method named setTime(long elapseTime) that sets a new time
	// for the object using the elapsed time.
	public void setTime(long elapseTime) {
		this.hours = (int) ((elapseTime / (1000 * 60 * 60)) % 24);
		this.minute = (int) ((elapseTime / (1000 * 60)) % 60);
		this.second = (int) (elapseTime / 1000) % 60;

	}
}