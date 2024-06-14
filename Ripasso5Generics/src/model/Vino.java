package model;

public class Vino implements Bevanda{

	@Override
	public String toString() {
		return " una bottiglia di vino";
	}

	@Override
	public String versa() {
		return " del vino";
	}

	
}
