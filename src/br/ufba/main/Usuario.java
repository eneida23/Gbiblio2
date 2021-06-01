package br.ufba.main;

import br.ufba.blibio.observador.UsuarioObservador;

public abstract class Usuario {
	private Integer codigo;
	private String nome;
	private TipoUsuario tipo;

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
	
	public TipoUsuario getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			if (((Usuario) obj).getCodigo().equals(this.codigo)) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
