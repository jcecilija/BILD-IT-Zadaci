package zadaci_09_02_2016;

public class MyStringBuilder1 {

	String nesto;

	// konstruktor koji nam kreiramo nas objekat string
	public MyStringBuilder1(String s) {
		this.nesto = s;
	}

	// metoda koja dodaje string na string
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		this.nesto = this.nesto + s.nesto;
		return new MyStringBuilder1(this.nesto);
	}

	// metoda koja dodaje nasem stringu broj na kraju
	public MyStringBuilder1 append(int i) {
		this.nesto = this.nesto + i;
		return new MyStringBuilder1(this.nesto);
	}

	// metoda koja vraca duzinu
	public int length() {
		return nesto.length();
	}

	// metoda koja vraca karakter na odredjenom indeksu
	public char charAt(int index) {
		return nesto.charAt(index);
	}

	// metoda koja pretvara sve u mala slova
	public MyStringBuilder1 toLowerCase() {
		String novi = "";
		for (int i = 0; i < this.nesto.length(); i++) {
			novi = novi + Character.toLowerCase(nesto.charAt(i));
		}
		return new MyStringBuilder1(novi);
	}

	// metoda koja sijece string od begin do end i to je string novi
	public MyStringBuilder1 substring(int begin, int end) {
		// kreiramo novi prazan string i u njega smjestamo karaktere od begin do
		// end naseg stringa
		String novi = "";
		for (int i = begin; i <= end; i++) {
			novi = novi + this.nesto.charAt(i);
		}
		return new MyStringBuilder1(novi);
	}

	// metoda to string vraca nam nas objekat nesto
	public String toString() {
		return this.nesto;
	}

	public static void main(String[] args) {
		// (Implement the StringBuilder class) The StringBuilder class is
		// provided
		// in the Java library. Provide your own implementation for the
		// following methods
		// (name the new class MyStringBuilder1):
		// public MyStringBuilder1(String s);
		// public MyStringBuilder1 append(MyStringBuilder1 s);
		// public MyStringBuilder1 append(int i);
		// public int length();
		// public char charAt(int index);
		// public MyStringBuilder1 toLowerCase();
		// public MyStringBuilder1 substring(int begin, int end);
		// public String toString();

		MyStringBuilder1 ja = new MyStringBuilder1("Svetlana Jovanovic");
		MyStringBuilder1 ti = new MyStringBuilder1("neko drugi");
		System.out.println("Prvi objekat string je: " + ja);
		System.out.println("Drugi objekat string je: " + ti);
		// ispisujemo rezultat poziva prve metode kad dodaje na ja ti
		System.out.println("Dodano na ja objekat ti : " + ja.append(ti));
		// ispis rezultata poziva druge metode koja dodaje na ja broj
		System.out.println("Dodamo na objekat string ja broj 5: " + ja.append(5));
		// ispis duzine objekta ja
		System.out.println("Duzina objekata je: " + ja.length());
		// ispis karaktera na indeksu 7
		System.out.println("Karakter na indeksu 7 je : " + ja.charAt(7));
		// ispis kada pozivamo metodu koja pretvara u mala slova sve
		System.out.println("Sve malim slovima je : " + ja.toLowerCase());
		// ispis kada sijecemo od do nas string
		System.out.println("Isjeceno od 3 do 8 je : " + ja.substring(3, 8));
		// ispis metode toString
		System.out.println("Sve ispisano zajedno string : " + ja.toString());

	}

}
