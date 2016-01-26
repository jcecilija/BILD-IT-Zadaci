package zadaci_25_01_2016;

import java.util.*;

public class TacanDatum {

	public static void main(String[] args) {
		// Ako pozovemo metodu System.currentTimeMillis() dobijemo broj
		// milisekundi od 1. januara 1970 do trenutka pozivanja metode. Napisati
		// program koji ispisuje trenutačni datum i vrijeme u formatu "Trenutni
		// datum i vrijeme: 22. juli, 2015 19:59:47"

		// pozivamo metodu da dobijemo broj milisekundi od 1 jan 1970god.
		long milisekundi = System.currentTimeMillis();
		// ako podijelimo sa 1000 milisekunde dobijemo ukupno sekundi od tog
		// datuma
		int ukupnoSekundi = (int) milisekundi / 1000;
		// sa modul od 60 od ukupno sekundi dobijemo trenutno sekudni
		int sekundi = ukupnoSekundi % 60;
		// ukupno minuta dobijemo kada ukupno sekudni podijelimo sa 60
		int ukupnoMinuta = ukupnoSekundi / 60;
		// a trenutno koliko je minuta dobijemo od % 60 od ukupno minuta
		int minuta = ukupnoMinuta % 60;
		// sa ukupno sati podijelimo minute sa 60
		int ukupnoSati = ukupnoMinuta / 60;
		// a za trenutni sat modul 60 od ukupno sati
		int sati = ukupnoSati % 24;
		// iz klase java.util.* stampamo komplet i datum i vrijeme trenutno ali
		System.out.println(new Date());
		// ne poklapa se sa ovim dole sto stampa, jer ne znam podesit GMT al ne
		// znam kako se radi zadatak
		System.out.println("Trenutni datum i vrijeme: " + sati + ":" + minuta + ":" + sekundi);
	}

}
