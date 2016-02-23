package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prvi {
	// metoda za racunanje fib broja pomocu for petlje
	public static int fib(int n) {
		// inicijalizujemo f0 i f1
		int f0 = 0;
		int f1 = 1;
		int currentFib;
		// sa for petljom prolazimo i sabiremo brojeve kako se racuna fib broj
		for (int i = 1; i <= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		} // metoda nam vraca fib broj na trazenom indexu
		return f1;
	}

	public static void main(String[] args) {
		// (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
		// iterations.
		// Hint: To compute fib(n) without recursion, you need to obtain fib(n -
		// 2)
		// and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
		// numbers.
		// The current Fibonacci number would then be f0 + f1. The algorithm
		// can be described as follows: f0 = 0; For fib(0) f1 = 1;
		// For fib(1) for (int i = 1; i <= n; i++) { currentFib = f0 + f1;f0 =
		// f1;f1 = currentFib;}
		// After the loop, currentFib is fib(n)
		// Write a test program that prompts the user to enter an index and
		// displays its Fibonacci number.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite cio broj:");
		// deklarisemo broj
		// int broj;
		// dok je tacno da petlja radi
		while (true) {
			// pokusaj
			try {
				int broj = input.nextInt();
				// ispis i poziv metode
				System.out.println("Fib broj na indexu: " + broj + " je: " + fib(broj));
			} // hvatanje greske
			catch (InputMismatchException e) {
				// ispis greske
				System.out.println(e);
			}
			input.close();
		}
	}
}