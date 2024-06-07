package teoria;

public class MetodiAusiliari {

	public static void main(String[] args) {
		try {

			String nome = "Carlo";
			int eta = 33;
			// nome e eta sono ARGOMENTI
//		metodoAusiliario("Carlo", 33);
			// nome va nella prima posizione del metodo se corrisponde il tipo della
			// varibile
			String risultato = metodoAusiliario(nome, eta);

			System.out.println(eta);
			System.out.println(nome);
			System.out.println(risultato);

			double area;
			area = areaParallelogramma(3, 4.0);
			System.out.println(area);
			
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	private static double areaParallelogramma(double base, double altezza) throws IllegalArgumentException 
	{
		if(base < 0)
		{
			throw new IllegalArgumentException();
		}
		if(altezza < 0)
		{
			throw new IllegalArgumentException();
		}
		
		
		double a = base * altezza;
		return a;
	}
	


	// funzione di js
//	restituisce qualcosa? 
//	se no metto void
//	se si metto il tipo da restituire e metto un return
	public static String metodoAusiliario(String nomePersona, int etaPersona)// PARAMETRI del metodo
	{
		etaPersona += 10;
		nomePersona = "Ciao " + nomePersona + ", eta " + etaPersona;
		System.out.println(etaPersona);
//		System.out.println(nome);

		return nomePersona;
	}

}
