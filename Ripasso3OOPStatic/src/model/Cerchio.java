package model;

public class Cerchio {

	//static:  condiviso con tutte le istanze della classe
	//final: costante
	public static final double PIGRECO = 3.14;
	
	//non serve il costruttore
	public static double areaRaggioUno() {
		return PIGRECO*1*1;
	}
	
	public static double area(double raggio) {
		return PIGRECO*Math.pow(raggio, 2);
	}
	
}
