package zadaci_05_02_2016;

public class Fan {
	// (The Fan class) Design a class named Fan to represent a fan. The class
	// contains:
	// ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and
	// 3 to denote the fan speed.
	// A private int data field named speed that specifies the speed of the fan
	// (the
	// default is SLOW).
	// ■ A private boolean data field named on that specifies whether the fan is
	// on (the default is false).
	// ■ A private double data field named radius that specifies the radius of
	// the fan (the default is 5).
	// ■ A string data field named color that specifies the color of the fan
	// (the defaul is blue).
	// ■ The accessor and mutator methods for all four data fields.
	// ■ A no-arg constructor that creates a default fan.
	// ■ A method named toString() that returns a string description for the
	// fan. If
	// the fan is on, the method returns the fan speed, color, and radius in one
	// combined string. If the fan is not on, the method returns the fan color
	// and radius along with the string “fan is off” in one combined string.
	// Draw the UML diagram for the class and then implement the class. Write a
	// test
	// program that creates two Fan objects. Assign maximum speed, radius 10,
	// color
	// yellow, and turn it on to the first object. Assign medium speed, radius
	// 5, color blue, and turn it off to the second object. Display the objects
	// by
	// invoking their toString method.

	// konstante brzne
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	// pocetna data fields
	private int speed = SLOW;
	private boolean ON = false;
	private double RADIUS = 5;
	public String color = "blue";

	// geteri i seteri idu dole
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isON() {
		return ON;
	}

	public void setON(boolean oN) {
		ON = oN;
	}

	public double getRADIUS() {
		return RADIUS;
	}

	public void setRADIUS(double rADIUS) {
		RADIUS = rADIUS;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// no arg konstruktor
	public Fan() {
	}

	// metoda
	public String toString() {
		// kreiramo prazan string u koji cemo ispisati brzinu koja je
		String brzina = "";
		if (this.speed == 1) {
			brzina = "slow";
		} else if (this.speed == 2) {
			brzina = "MEDIUM";
		} else if (this.speed == 3) {
			brzina = "FAST";
		}
		// uslov ako je upaljen ispisi
		if (this.ON) {
			return ("brzina je: " + brzina + " boja: " + getColor() + " radijus: " + getRADIUS());
		} else {// ako nije upaljen ispisi
			return ("Fan is turned off , radijus je: " + getRADIUS() + " a boja : " + getColor());
		}
	}
}
