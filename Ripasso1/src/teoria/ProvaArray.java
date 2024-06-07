package teoria;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProvaArray {

	private static final Logger LOGGER = Logger.getLogger(ProvaArray.class.getName());	
	
	public static void main(String[] args) {
		try {
			//[0][1][2][3][4][5][6][7][8][9][10][11] indici dell'array
			int[] numeroGiorniPerMese = new int[12]; // dichiarazione e allocazione dell'array;
			numeroGiorniPerMese[0] = 31; // gennaio, primo mese, posizione 0
			numeroGiorniPerMese[1] = 28; // febbraio (non funziona per i bisestili ma non ci interessa)
			// etc ...
			numeroGiorniPerMese[11] = 31; // dicembre
			
			
//			numeroGiorniPerMese[12] = 30;
			
			int[] numeri = new int[10];
			for (int i = 0; i < numeri.length; i++) {
				//si ferma a i = 11 e non va in eccezione
				//perchè 10<10 è false e non esegue il codice
				numeri[i] = i;				
			}
//			System.out.println(numeri);
			
			
			
			//letterale: qual'è la dimensione?? =>  length = 12
			int [] numeroGiorniPerMese2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			//new int[][] 
			float[][] mat =  {
								{ 1, 2, 3 }, //0
								{ 4, 5, 6 }, //1
								{ 7, 8, 9, 10, 11 } //2
					};
			
//			System.out.println(mat.length);
			for (int i = 0; i < mat.length; i++) { //esterno
				
//				System.out.println(mat[i].length);					
				for (int j = 0; j < mat[i].length; j++) { //interno
					System.out.println(mat[i][j]);
				}
			}
			
			//come faccio ad ordinarlo in ordine crescente?
			int[] ordinami = {6,3,8,3,8,0,3};
			//for o while, o for annidati, con if else......
			
			Arrays.sort(ordinami);			
			
			for (int i : ordinami) {
				System.out.println(i);
			}
			
			String[] ordinami2 = {"Gianni", "Paolo", "Giuseppe"};
			Arrays.sort( ordinami2);			
			for (String i : ordinami2) {
				System.out.println(i);
			}

		} catch (IndexOutOfBoundsException e) {
			// e.printStackTrace();
			LOGGER.log(Level.SEVERE, e.toString(), e);		
		} catch (Exception e) {
			// e.printStackTrace();
			LOGGER.log(Level.SEVERE, e.toString(), e);
		}

	}
	
	
	
	
	
	

}
