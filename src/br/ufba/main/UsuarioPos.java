package br.ufba.main;

public class UsuarioPos extends Usuario {

	public UsuarioPos(Integer codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
		super.setTipo(TipoUsuario.POSGRADUACAO);
	}
}