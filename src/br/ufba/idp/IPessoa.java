package br.ufba.idp;

public interface IPessoa {
	public String getNome(); 	
	public String  getCodPessoa();
	public int getDuracaoEmprestimoEmDias();
	void setNome(String nome);
	void setCodPessoa (String codPessoa);	
}