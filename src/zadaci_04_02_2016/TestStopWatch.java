package zadaci_04_02_2016;

import java.util.Arrays;

public class TestStopWatch {

	public static void main(String[] args) {
		// pozivajuci konstruktor i new operator kreiramo nasu stopericu
		StopWatch stoperica = new StopWatch();
		// pozivamo metodu start nad stopericom
		stoperica.start();
		// ispis
		System.out.println(stoperica.getStartTime());
		// napravimo niz u koji smjestimo brojeve koje treba da sortiramo
		int[] brojevi = new int[100000];
		for (int i = 0; i < 100000; i++) {
			int broj = (int) (Math.random() * 100);
			brojevi[i] = broj;
		}
		// pozivamo metodu za sortiranje brojeva
		Arrays.sort(brojevi);
		// pozivamo metodu stop
		stoperica.stop();
		// ispis vremena koje nam je trebalo da sortiramo niz
		System.out.println(stoperica.getElapsedTime());

	}

}
