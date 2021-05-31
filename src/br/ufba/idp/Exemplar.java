package br.ufba.idp;

public class Exemplar {
	private String codexemplar;
	private int qtexemplares;
	private int qtdisponiveis;
	private Livro livro;

	public String getCodexemplar() {
		return codexemplar;
	}

	public void setCodexemplar(String codexemplar) {
		this.codexemplar = codexemplar;

	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQtexemplares() {
		return qtexemplares;
	}

	public void setQtexemplares(int qtexemplares) {
		this.qtexemplares = qtexemplares;
	}

	public int getQtdisponiveis() {
		return qtdisponiveis;
	}

	public void setQtdisponiveis(int qtdisponiveis) {
		this.qtdisponiveis = qtdisponiveis;
	}

	public String getEstado() {
		if (this.getQtdisponiveis() > 0) {
		return "DISPONIVEL";
		}
		return "INDISPONIVEL";
	}

	/*
	 * public void atualizaQtdisponiveis(Exemplar exep, int quantidade) {
	 * exep.setQtdisponiveis(quantidade); }
	 */
}
