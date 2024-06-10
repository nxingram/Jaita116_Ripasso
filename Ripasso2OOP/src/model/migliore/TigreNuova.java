package model.migliore;

public class TigreNuova extends Specie {
	private String nome;

	public TigreNuova(String genere, String famiglia, String specie, String nome) {
		super(genere, famiglia, specie);
		this.nome = nome;
	}

	public String nome()
	{
		return super.nome() + ", " + this.nome;
	}
}
