package model.migliore;

public class Famiglia extends Genere {
	private String famiglia;

	public Famiglia(String genere, String famiglia) {
		super(genere);
		this.famiglia = famiglia;
	}
	
	public String nome()
	{
		return super.nome() + ", " + this.famiglia;
	}
	
}
