package zadaci_04_02_2016;

public class TestAccount {

	public static void main(String[] args) {
		// Write a test program that creates an Account object with an account
		// ID of 1122,
		// a balance of $20,000, and an annual interest rate of 4.5%. Use the
		// withdraw
		// method to withdraw $2,500, use the deposit method to deposit $3,000,
		// and print
		// the balance, the monthly interest, and the date when this account was
		// created.

		// kreiramo account objekat ja
		Account ja = new Account(1122, 20000);
		// stavi objektu ja na racun 20000km
		ja.setBalance(20000);
		System.out.println("Datum kreiranja racuna je: " + ja.getDateCreated());
		// postavi godisnju kamatnu stopu
		ja.setAnnualInterestRate(4.5);
		System.out.println("Trenutno na racunu je: " + ja.getBalance());
		System.out.println("Mjesecna kamatna stopa je: " + ja.getMonthlyInterestRate());
		// podigni sa racuna
		ja.withdraw(2500);
		System.out.println("Trenutno na racunu poslije podizanja ima: " + ja.getBalance());
		// polozi na racun 3000
		ja.deposit(3000);
		System.out.println("Trenutno na racunu poslije polaganja je : " + ja.getBalance());
	}
}
