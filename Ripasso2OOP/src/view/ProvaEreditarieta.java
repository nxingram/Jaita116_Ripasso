package view;

import model.Felino;
import model.Puma;
import model.Tigre;

public class ProvaEreditarieta {

	public static void main(String[] args) {
		//Felino felino2 = new Felino("Felidae", "Panthera");
		
		//new chiama il costruttore della classe
		Tigre tigre1 = new Tigre("Felidae", "Panthera", "P.tigris");		
		String nome1 = tigre1.nome();
		System.out.println(nome1);		
		
		
		Puma puma1 = new Puma("Felidae", "Panthera", "P.concolor");
		String nome2 = puma1.nome();
		System.out.println(nome2);
		
		//new (costruttore) crea un'istanza
		Felino tigre2 = new Tigre("Felidae", "Panthera", "P.tigris");		
		Felino puma2 = new Puma("Felidae", "Panthera", "P.concolor");
		System.out.println(tigre2.nome());
		System.out.println(puma2.nome());	
		
		
		if(tigre2 instanceof Tigre)
		{
			System.out.println("è una " + Tigre.class.getSimpleName());
		}
		if(puma2 instanceof Puma)
		{
			System.out.println("è un " + Puma.class.getSimpleName());
		}
		
		Felino[] arrayFelini ={tigre1,tigre2,puma1,puma2};
		
		for (Felino felino : arrayFelini) {
			felino.nome();
			if(felino instanceof Tigre)
			{
				System.out.println("è una " + Tigre.class.getSimpleName());
				((Tigre) felino).metodoTigre();
			}
			
			if(felino instanceof Puma)
			{
				System.out.println("è un " + Puma.class.getSimpleName());
				((Puma) felino).metodoPuma();
			}
		}
		
	}
	
}
