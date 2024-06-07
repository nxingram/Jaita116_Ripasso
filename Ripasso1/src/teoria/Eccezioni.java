package teoria;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Eccezioni {

	//https://stackoverflow.com/questions/5950557/good-examples-using-java-util-logging
	private static final Logger LOGGER = Logger.getLogger( Eccezioni.class.getName() );
	
	public static void main(String[] args) {
		try {// prova

			String nulla = null;			
			
//			if (nulla != null) {
				//per evitare eccezione, controllo se la variabile è nulla (o altri controlli)
				int lunghezza = nulla.length(); // lancia null pointer exception
				// se viene lanciato null pointer, il resto del codice non viene eseguito
//			}

			int a = 7, b = 3;
			if (a > b) {
				throw new Exception("maggiore");// errore della logica
			} else {
				System.out.println("minore");
			}

		} catch (NullPointerException e) { // se errore
//			System.err.println("Null pointer");
//			e.printStackTrace();//stampa storico dell'errore
			LOGGER.log( Level.SEVERE, e.toString(), e );
		} catch (Exception e) { // se errore
			System.err.println("Generica");
			LOGGER.log( Level.SEVERE, e.toString(), e );
		}

	}

}
