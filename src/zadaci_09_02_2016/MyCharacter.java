package zadaci_09_02_2016;

public class MyCharacter {

	char karakter;

	public MyCharacter(char slovo) {
		this.karakter = slovo;
	}

	// metoda koja provjerava da li je nas karkter slovo
	public boolean isSlovo(MyCharacter slovo) {
		if ((slovo.karakter >= 'A' && slovo.karakter <= 'Z') || (slovo.karakter >= 'a' && slovo.karakter <= 'z'))
			return true;
		else
			return false;
	}

	// metoda koja provjerava da li je nas karakter broj
	public boolean isBroj(MyCharacter slovo) {
		if ((slovo.karakter >= '0' && slovo.karakter <= '9')) {
			return true;
		} else
			return false;
	}

	// metoda koja pretvara nas karakter u veliko slovo pomocu ascii koda
	public MyCharacter toUpperCase() {
		if (this.karakter >= 97 && this.karakter <= 122) {
			return new MyCharacter((char) ((int) this.karakter - 32));
		} else {
			return new MyCharacter(this.karakter);
		}
	}

	// metoda koja nam pretvaraq u malo slovo nas karakter uz pomoc ascii koda
	public MyCharacter toLowerCase() {
		if (this.karakter >= 65 && this.karakter <= 90) {
			return new MyCharacter((char) ((int) this.karakter + 32));
		} else {
			return new MyCharacter(this.karakter);
		}
	}

	// metoda uz pomoc koje stampamo nas objekat karakter tako sto pretvaramo u
	// string
	public String toString() {
		String ispis = "";
		ispis = ispis + this.karakter;
		return ispis;
	}

	public static void main(String[] args) {
		// (Implement the Character class) The Character class is provided in
		// the Java
		// library. Provide your own implementation for this class. Name the new
		// class
		// MyCharacter.

		// pravimo objekat nase klas
		MyCharacter k = new MyCharacter('A');
		// ispitujemo ispisujemo rezultate poziva metoda nad objektom
		System.out.println("Da li je nas karakter broj: " + k.isBroj(k));
		System.out.println("Da li je nas karakter slovo: " + k.isSlovo(k));
		System.out.println("Pretvori u malo slovo " + k.toLowerCase());
		System.out.println("Pretvori u veliko slovo " + k.toUpperCase());

	}

}
