package br.ufba.blibio.observador;

import br.ufba.main.Usuario;

public abstract class UsuarioObservador {
	private Usuario usuario;
	
	public abstract void atualizar();
	
	public Integer getCodigo() {
		return usuario.getCodigo();
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UsuarioObservador) {
			if (((UsuarioObservador) obj).getCodigo().equals(this.getCodigo())) {
				return true;
			}
		}
		
		return false;
	}
}
