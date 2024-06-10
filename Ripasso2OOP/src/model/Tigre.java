package model;

public class Tigre extends Felino {

	private String specie;

	public Tigre(String famiglia, String genere, String specie) {
		super(famiglia, genere);
		this.specie = specie;
		
	}

	public String getSpecie() {
		return specie;
	}

	@Override
	public String nome() {
		return super.nome() + " " + this.specie+ ", Tigre";
	}

	public void metodoTigre() {
		System.out.println( "micione");
	}
	
	
//
//	public void setFamiglia(String famiglia) {
//		this.famiglia = famiglia;
//	}
	
	
	
	
}
