package teoria;

import java.util.Scanner;

public class InputProva {
	public static void main(String[] args) {
		Scanner mioScanner = new Scanner(System.in); //input da tastiera
//		System.out.println("Scrivi il tuo nome");
//		String nome = mioScanner.nextLine();
		String nome = leggiNome(mioScanner);
		System.out.println("Il tuo nome è: " + nome);
		
		System.out.println("Scrivi la tua età");
		int eta = mioScanner.nextInt();
		System.out.println("la tua età è: " + eta);
		mioScanner.close();
		
	}

	private static String leggiNome(Scanner mioScanner) {
		System.out.println("Scrivi il tuo nome");
		String nome = mioScanner.nextLine();
		return nome;
	}
	
	
}
