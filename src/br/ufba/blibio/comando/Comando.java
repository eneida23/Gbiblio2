package br.ufba.blibio.comando;

public abstract class Comando {
	private int codigoUsu;
	private int codigoLivro;

	public int getCodigoLivro() {
		return codigoLivro;
	}
	
	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	
	public int getCodigoUsu() {
		return codigoUsu;
	}
	
	public void setCodigoUsu(int codigoUsu) {
		this.codigoUsu = codigoUsu;
	}
	
	public abstract void executar() throws ComandoException;
}
