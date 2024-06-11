package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProvaComparable {

	public static void main(String[] args) {
		LibroController ctrl = new LibroController();
		
		ArrayList<Libro> libri = new ArrayList<Libro>();
		libri.add(new Libro("Harry potter e l'ordine della fenice", "Rowling", 1305, 9.15));
		libri.add(new Libro("Il signore degli anelli", "Tolkien", 1225, 20.25));
		libri.add(new Libro("Dieci piccoli indiani", "Agatha Christie", 208, 10.50));
		libri.add(new Libro("Harry potter e la pietra filosofale", "Rowling", 1402, 8.25));
		
		ctrl.stampaLibri(libri);
		
		Collections.sort(libri);
		
		ctrl.stampaLibri(libri);
		
		Collections.sort(libri, new LibroPagineComparator());
		
		ctrl.stampaLibri(libri);
		
		
		//classe anonima che implementa l'interfaccia Comparator
		//anonima = non ha nome
		Collections.sort(libri, new Comparator<Libro>() {

			@Override
			public int compare(Libro l1, Libro l2) {
				return (int)(l2.getPrezzo() - l1.getPrezzo());
			}			
		});
		
		ctrl.stampaLibri(libri);
		
		//lambda function
		//ho totlto tutto, implemento solo il metodo che serve per confrontare i libri
		Collections.sort(libri, (libro1, libro2) ->   libro2.getPagine() - libro1.getPagine());
		
		ctrl.stampaLibri(libri);
		
		//stessa cosa
		//Comparator<Libro> comparator = (libro1, libro2) ->   libro2.getPagine() - libro1.getPagine();
		//Collections.sort(libri, comparator);
		
		//Consumer<Libro> consumer = libro -> System.out.println(libro) ;
		//libri.forEach( consumer );
		libri.forEach( libro -> System.out.println(libro) );
		
		System.out.println("========================");
		
		//if(libro.getPrezzo() < 20) - filtro espressione condizione
		//Predicate<Libro> predicate = libro -> libro.getPrezzo() < 20;
		libri
			.stream()
			//.filter(predicate)
			.filter( libro -> libro.getPrezzo() < 20 )
			.sorted((l1, l2) -> l1.getPagine() - l2.getPagine())
			//.forEach(libro -> System.out.println(libro));
			.forEach(System.out::println);
			
			
		List<Libro> listaLibriFiltrataEOrdinata = libri			
			.stream()
			.filter( libro -> libro.getPrezzo() < 20 )
			.sorted((l1, l2) -> l1.getPagine() - l2.getPagine())
			.toList(); //trasforma lo stream di nuovo in lista
		
		System.out.println("========================");
		//Function<Libro, String> select = libro -> libro.getAutore();
		libri
			.stream()
			.map(libro -> libro.getAutore()) //select
			.distinct()
			.sorted()
			.forEach(System.out::println);
			
		
		
	}
}
