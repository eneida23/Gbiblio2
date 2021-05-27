package br.ufba.idp;

public class Exemplar {
	private String codexemplar;
	private double qtexemplares = 0;
	private Livro livro;

	public String getCodexemplar() {
		return codexemplar;
	}

	public void setCodexemplar(String codexemplar) {
		this.codexemplar = codexemplar;

	}

	public double getQtexemplares() {
		return qtexemplares;
	}

	public void setQtexemplares(double qtexemplares) {
		this.qtexemplares = qtexemplares;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
