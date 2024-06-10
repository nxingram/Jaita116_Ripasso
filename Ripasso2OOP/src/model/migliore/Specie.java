package model.migliore;

public class Specie extends Famiglia {
	private String specie;

	public Specie(String genere, String famiglia, String specie) {
		super(genere, famiglia);
		this.specie = specie;
	}

	public String nome()
	{
		return super.nome() + ", " + this.specie;
	}

	
}
