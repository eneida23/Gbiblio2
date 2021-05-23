package br.ufba.idp;


public class Exemplar {
	private double qtexemplares = 0;
	private String codexemplar; 
	
	public double getQtexemplares() {
		return qtexemplares;
	}
		
	public void setQtexemplares(Livro liv)  {
		this.qtexemplares += liv.getQtexemplares();
	}

	public String getCodexemplar() {
		return codexemplar;
	}

	public void setCodexemplar(String codexemplar) {
		this.codexemplar = codexemplar;
	}
}
