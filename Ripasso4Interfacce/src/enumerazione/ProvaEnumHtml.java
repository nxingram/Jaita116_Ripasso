package enumerazione;

public class ProvaEnumHtml {
	public enum Giorno {
		LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
	};

	public static void main(String[] args) {
		// scegliamo un valore
		Giorno giornoDellaSettimana = Giorno.GIOVEDI;
		System.out.println(giornoDellaSettimana);
		
		// definiamo una logica
		switch (giornoDellaSettimana) {
		case LUNEDI:
			System.out.println("Oggi è Lunedì");
			break;
		case MARTEDI:
			System.out.println("Oggi è Martedì");
			break;
		case MERCOLEDI:
			System.out.println("Oggi è Mercoledì");
			break;
		case GIOVEDI:
			System.out.println("Oggi è Giovedì");
			break;
		case VENERDI:
			System.out.println("Oggi è Venerdì");
			break;
		case SABATO:
			System.out.println("Oggi è Sabato");
			break;
		case DOMENICA:
			System.out.println("Oggi è Domenica");
			break;
		}
		
		for( Giorno d : Giorno.values() ) {
			System.err.println(d);
		}
		
		for (Elemento  e : Elemento.values()) {
			System.out.println(e + ", " +e.getSimbolo() + ", " + e.getNumeroAtomico()+ ", " + e.getMassaAtomica());
		}
	}
}
