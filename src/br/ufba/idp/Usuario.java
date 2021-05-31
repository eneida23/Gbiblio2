package br.ufba.idp;

public abstract class Usuario {
private Integer  codigo;
private String nome;


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getCodigo() {
	return codigo;
}
public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}



}
