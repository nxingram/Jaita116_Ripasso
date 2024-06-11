package comparable;

import java.util.Comparator;

public class LibroPagineComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro libro1, Libro libro2) {
		// restituisce 0 se i libri sono =
		// restituisce positivo o negativo se  uno dei 2 libri ha + pagine
		//l1 100, l2 100 => 100 -100 = 0 sono = 
		//l1 150, l2 100 => 150 -100 = 50 => l1 ha + pagine
		//ordine crescente per numero di pagine
		return libro1.getPagine() - libro2.getPagine();
	}

}
