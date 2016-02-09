package zadaci_09_02_2016;

public class MyString1 {

	// tip podatka sa kojim radimo
	char[] chars;

	// konstruktor kojim kreiramo nas objekat niz carova
	public MyString1(char[] chars) {
		this.chars = chars;
	}

	// vraca odredjeni karakter na zadanom iondeksu
	public char chartAt(int index) {
		return chars[index];
	}

	// vraca duzinu
	public int length() {
		return chars.length;
	}

	// vraca dio stringa od do kojeg indeksa
	public MyString1 substring(int begin, int end) {
		char[] chars1 = new char[end - begin];
		for (int i = 0; i < chars1.length; i++) {
			chars1[i] = this.chars[begin + i];
		}
		return new MyString1(chars1);
	}

	// pretvara sve u mala slova
	public MyString1 toLowerCase() {
		char[] novi = new char[chars.length];
		for (int i = 0; i < novi.length; i++) {
			novi[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString1(novi);
	}

	// provjera da li su objekti jednaki
	public boolean equals(MyString1 s) {
		boolean jednaki = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.chars[i] == this.chars[i]) {
				jednaki = true;
			} else
				jednaki = false;
		}
		return jednaki;
	}

	// metoda koja vraca string koji predstavlja vrijednost int
	public static MyString1 valueOf(int i) {
		return new MyString1(Integer.toString(i).toCharArray());

	}

	public String toString() {
		String vrati = "";
		for (int i = 0; i < chars.length; i++) {
			vrati = vrati + chars[i];
		}
		return vrati;
	}

	public static void main(String[] args) {
		// Implement the String class) The String class is provided in the Java
		// library.
		// Provide your own implementation for the following methods (name the
		// new
		// class MyString1):
		// public MyString1(char[] chars);
		// public char charAt(int index);
		// public int length();
		// public MyString1 substring(int begin, int end);
		// public MyString1 toLowerCase();
		// public boolean equals(MyString1 s);
		// public static MyString1 valueOf(int i);

		// prvi niz koji cemo pretvoriti u objekat
		char[] karakteri = { 'a', 'n', 'i', 'd', 'o', 'j', 'd', 'i', 'S', 'u', 'T', 'R', 'A' };
		// drugi niz koji nam treba zbor poredjenja
		char[] drugiKarakteri = { 'a', 'n', 'a' };
		MyString1 tekst = new MyString1(karakteri);
		// ispis i poziv metode koja nam vraca odredjeni karakter
		System.out.println("Karaker na indeksu 5 je: " + tekst.chartAt(5));
		// poziv i ispis metode koja vraca duzinu
		System.out.println("Duzina naseg objekta tekst je: " + tekst.length());
		// kreiramo novi objekat koji dobijamo kada primjenimo metodu substring
		// na prvi objekat
		MyString1 dioStringa = tekst.substring(4, 8);
		// ispis
		System.out.println("Nas substringovan string je:");
		for (int i = 0; i < dioStringa.length(); i++) {
			System.out.print(dioStringa.chartAt(i) + " ");
		}
		System.out.println();
		// metoda za mala slova
		System.out.println("Pretvoreno sve u mala slova :" + tekst.toLowerCase());
		// poziv i ispis metode koja poredi dva stringa karaktera
		System.out.println("Da li su jednaki stringovi: " + tekst.equals(drugiKarakteri));
		System.out.println("Pretvoreni karakteri int u string objekat su:" + MyString1.valueOf(743));
	}

}
