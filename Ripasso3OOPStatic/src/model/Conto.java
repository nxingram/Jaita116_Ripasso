package model;

public class Conto {

	public static int numeroConto = 0;	
	private int numContoAutoincrement;
	public String Nome;
	
	public Conto(String nome) {
		super();
		Nome = nome;
		this.numContoAutoincrement = ++numeroConto;
	}
}
