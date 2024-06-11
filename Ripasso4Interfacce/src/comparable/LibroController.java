package comparable;

import java.util.ArrayList;

public class LibroController {

	public void stampaLibri(ArrayList<Libro> libri) {
		for (Libro libro : libri) {
			System.out.println(libro.toString());
		}
		
		System.out.println("=============================");
	}

	
	
}
