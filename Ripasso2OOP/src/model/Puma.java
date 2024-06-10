package model;

public class Puma extends Felino{

	private String specie;

	public Puma(String famiglia, String genere, String specie) {
		super(famiglia, genere);
		this.specie = specie;
	}
	
	@Override
	public String nome() {
		return super.nome() + " " + this.specie + ", Puma";
	}
	
	public void metodoPuma() {
		System.out.println( "micetto");
	}
	
}
