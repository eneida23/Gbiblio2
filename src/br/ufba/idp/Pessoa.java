package br.ufba.idp;

public class Pessoa implements IPessoa{
private String nome;
private String  codPessoa;
public int duracaoEmprestimoEmDias = 3;

public Pessoa(String nome, String codPessoa) {
	setNome(nome);
	setCodPessoa (codPessoa);
	
}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String  getCodPessoa() {
		// TODO Auto-generated method stub
		return codPessoa;
	}
	
	public void setCodPessoa (String codPessoa) {
		this.codPessoa = codPessoa;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getDuracaoEmprestimoEmDias() {
		return duracaoEmprestimoEmDias;
	}
}
