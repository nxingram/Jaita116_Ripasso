package model;

public abstract class Felino {
	private String famiglia;
	private String genere;
	
	public Felino(String famiglia, String genere) {
		super();
		this.famiglia = famiglia;
		this.genere = genere;
	}

	public String nome()
	{
		return this.famiglia + " " + this.genere;
	}

	public String getFamiglia() {
		return famiglia;
	}

	public String getGenere() {
		return genere;
	}

//	public String getFamiglia() {
//		return famiglia;
//	}
//
//	public void setFamiglia(String famiglia) {
//		this.famiglia = famiglia;
//	}
//

	

}
