package br.ufba.idp;


public class Exemplar {
	private double qtexemplares = 0;
	
	public double getQtexemplares() {
		return qtexemplares;
	}
		
	public void setQtexemplares(Livro liv)  {
		this.qtexemplares += liv.getQtexemplares();
	}
}
