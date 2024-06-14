package model;

public class Bottiglia<F extends Bevanda> {

	private F contenuto;
	
	public Bottiglia(F contenuto)
	{
		this.contenuto = contenuto;
	}

	public F getContenuto() {
		return contenuto;
	}	
	
}
