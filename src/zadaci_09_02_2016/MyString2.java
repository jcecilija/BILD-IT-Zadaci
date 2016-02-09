package zadaci_09_02_2016;

public class MyString2 {

	String nesto;

	// konstrukot kojim kreiramo objekat
	public MyString2(String s) {
		this.nesto = s;
	}

	// metoda koja poredi dva stringa i vraca int kao rezultat
	public int compare(String s) {
		if (this.nesto.length() > s.length()) {
			return 1;
		} else if (this.nesto.length() == s.length()) {
			return 0;
		} else
			return -1;
	}

	// metoda koja vraca novi string koji je odsjeceni dio naseg stringa s tim
	// da metodi proslijedimo indeks odakle da pocne sjecenje pa do kraja
	public MyString2 substring(int begin) {
		String dio = "";
		for (int i = begin; i < nesto.length(); i++) {
			dio = dio + this.nesto.charAt(i);
		}
		return new MyString2(dio);
	}

	// metoda koja pretvara sve u velika slova i vraca novi string sa velikim
	// slovima
	public MyString2 toUpperCase() {
		String velika = "";
		for (int i = 0; i < nesto.length(); i++) {
			velika = velika + Character.toUpperCase(nesto.charAt(i));
		}
		return new MyString2(velika);
	}

	// metoda koja pretvara nas objekat string tipa u niz charova
	public char[] toChars() {
		char[] niz = new char[this.nesto.length()];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = this.nesto.charAt(i);
		}
		return niz;
	}

	// metoda koja vraca boolean kao string vrijednost
	public static MyString2 valueOf(boolean b) {
		if (b) {
			return new MyString2("true");
		} else
			return new MyString2("false");
	}

	// metoda s kojom stampamo nas objekat
	public String toString() {
		return this.nesto;
	}

	public static void main(String[] args) {
		// (Implement the String class) The String class is provided in the Java
		// library.
		// Provide your own implementation for the following methods (name the
		// new
		// class MyString2):
		// public MyString2(String s);
		// public int compare(String s);
		// public MyString2 substring(int begin);
		// public MyString2 toUpperCase();
		// public char[] toChars();
		// public static MyString2 valueOf(boolean b);
		// sa konstruktorom kreiramo dva objekta
		MyString2 tekst = new MyString2("Svetlana");
		MyString2 prezime = new MyString2("Jovanovic");
		// ispis i poziv metode da li su jednaki
		System.out.println("Da li su jednaki : " + tekst.compare("Svetlana"));
		// ispis i poziv metode koja pretvara u velika slova
		System.out.println("Sve u velika slova: " + prezime.toUpperCase());
		// ispis i poziv metode koja nam odjseca dio string objekta naseg pocev
		// od indeksa 3
		System.out.println("Odsjeceno pocev od 3: " + prezime.substring(3));
		char[] niz = tekst.toChars();
		// ispis i metoda koja pretvara string u niz charova
		System.out.println("Carovi  pretvoreni iz stringa");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		// inicijalizujemo boolean da mozemo pozvati metodu value of
		boolean test = true;
		// ispis i poziv metode
		System.out.println(MyString2.valueOf(test));
	}
}
