package zadaci_05_02_2016;

public class TestFan {

	public static void main(String[] args) {
		// pravimo prvi objekat sa svim trazenim vrijednostima koje sa set
		// podesvamao
		Fan prvi = new Fan();
		prvi.setSpeed(3);
		prvi.setRADIUS(10);
		prvi.setColor("Yellow");
		prvi.setON(true);

		// pravimo drugi objekat i podesavamo sa set sve
		Fan drugi = new Fan();
		drugi.setSpeed(2);
		drugi.setRADIUS(5);
		drugi.setColor("Blue");
		drugi.setON(false);

		// ispis i poziv metode
		System.out.println(prvi.toString());
		System.out.println(drugi.toString());

	}

}
