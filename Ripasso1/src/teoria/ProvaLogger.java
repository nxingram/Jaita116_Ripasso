package teoria;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProvaLogger {

	private static final Logger LOGGER = Logger.getLogger(ProvaLogger.class.getName());
	
	

	public static void main(String[] args) {
		try {
			LOGGER.log(Level.INFO, "Inizio Programma");
			
			String nulla = null;
			LOGGER.log(Level.INFO, "Faccio qualcosa");
//			int lunghezza = nulla.length();
			
			LOGGER.log(Level.INFO, "Fine Programma");
			LOGGER.log(Level.INFO, "====================================");

		} catch (Exception e) {
			// e.printStackTrace();
			LOGGER.log(Level.SEVERE, e.toString(), e);
		}

	}
	
	
	
	
	
	

}
