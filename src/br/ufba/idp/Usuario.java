package br.ufba.idp;

public class Usuario implements IUsuario{
private String  codUsuario;
private String nome;

public String getCodUsuario() {
	return codUsuario;
}
public void setCodUsuario(String codUsuario) {
	this.codUsuario = codUsuario;
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
