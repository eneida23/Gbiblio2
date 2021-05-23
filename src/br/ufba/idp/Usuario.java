package br.ufba.idp;

public class Usuario implements IUsuario{
private String  codPessoa;
private String nome;

public String getCodPessoa() {
	return codPessoa;
}
public void setCodPessoa(String codPessoa) {
	this.codPessoa = codPessoa;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
@Override
public int getTempoEmprestimoEmDias() {
	// TODO Auto-generated method stub
	return 0;
}

}
