package service;

import model.Bevanda;
import model.Bottiglia;

public class BraccioAutomatico {
	
	//Nuovo
	private Bottiglia<? extends Bevanda> bottiglia;	
	
	//Nuovo
	public <T extends Bottiglia<? extends Bevanda>>BraccioAutomatico(T bottiglia) { //Bottiglia<? extends Bevanda>
		this.bottiglia = bottiglia;
	}
	

	//Nuovo
	public void versaContenuto() {
		System.out.println("Ho versato " + this.bottiglia.getContenuto().versa() /*.toString*/);
	}
	
	//Vecchio
	public BraccioAutomatico() {
	}

	//Vecchio
	public void prendiBottiglia(Bottiglia<?> bottiglia)
	{
		Object contenuto = bottiglia.getContenuto();
		System.out.println("Ho peso" + contenuto /*.toString*/);
	}
	//Vecchio
	public void versaContenuto(Bottiglia<?> bottiglia) {
		System.out.println("Ho versato " + bottiglia.getContenuto().versa() /*.toString*/);
	}
	

	
}
