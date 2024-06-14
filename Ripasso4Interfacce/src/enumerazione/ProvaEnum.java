package enumerazione;

import java.util.Scanner;

public class ProvaEnum {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleziona carburante");
		System.out.println("1. Benzina");
		System.out.println("2. Diesel");
		
		int selezione = sc.nextInt();
		Carburante carburante = null;
		switch (selezione) {
		case 1: 
			carburante = Carburante.BENZINA;
			break;
		case 2: 
			carburante = Carburante.DIESEL;
			break;

		}
		
		System.out.println(carburante.name());
		
		

		
	}
	
}
