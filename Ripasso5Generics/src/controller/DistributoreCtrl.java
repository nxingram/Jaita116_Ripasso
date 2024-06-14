package controller;

import java.util.ArrayList;
import java.util.List;

import model.Acqua;
import model.Bevanda;
import model.Bottiglia;
import model.Vino;
import service.BraccioAutomatico;

public class DistributoreCtrl {
	public static void main(String[] args) {

		int numeroBottiglie = 1;		
		
		//List<String> uno = new ArrayList<String>();
		//List<Integer> due = new ArrayList<Integer>();
		Acqua acqua = new Acqua();
		Bottiglia<Acqua> bottigliaAcqua = new Bottiglia<Acqua>(acqua);
		Bottiglia<Vino> bottigliaVino = new Bottiglia<Vino>(new Vino());
		
		distribuisci(bottigliaVino, numeroBottiglie);
		
		//no, perchè ho impostato un limite sul tipo di oggetto che può contenere la bottiglia
		//new Bottiglia<String>("sfkjghakjgh");
		
		Bottiglia<Bevanda> bottigliaVino2 = new Bottiglia<Bevanda>(new Vino());
		BraccioAutomatico braccioAutomatico2 = new BraccioAutomatico();
		braccioAutomatico2.versaContenuto(bottigliaVino2);
		
		
		Bottiglia<Bevanda> bottigliaAcqua2 = new Bottiglia<Bevanda>(new Acqua());
		BraccioAutomatico braccioAutomatico3 = new BraccioAutomatico(bottigliaAcqua2);
		braccioAutomatico3.versaContenuto(bottigliaAcqua2);
		
	}

	private static void distribuisci(Bottiglia<Vino> bottigliaVino, int n) {		
		BraccioAutomatico braccioAutomatico = new BraccioAutomatico();
		braccioAutomatico.prendiBottiglia(bottigliaVino);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
