package view;

import model.Felino;
import model.Tigre;
import model.migliore.TigreNuova;

public class ProvaEreditarieta2 {

	public static void main(String[] args) {
		
		//new chiama il costruttore della classe
		TigreNuova tigre1 = new TigreNuova("Felidae", "Panthera", "P. tigris", "Nerone");
		
		String nome1 = tigre1.nome();
		System.out.println(nome1);		
		
		
		if(tigre1 instanceof TigreNuova)
		{
			System.out.println("è una " + TigreNuova.class.getSimpleName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}
	
}
