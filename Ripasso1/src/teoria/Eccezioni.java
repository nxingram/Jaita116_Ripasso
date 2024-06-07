package teoria;

public class Eccezioni {


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
			System.err.println("Null pointer");
			e.printStackTrace();//stampa storico dell'errore
		} catch (Exception e) { // se errore
			System.err.println("Generica");
		}

	}

}
