package br.ufba.main;

public class UsuarioGrad extends Usuario {

	public UsuarioGrad(Integer codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
		super.setTipo(TipoUsuario.POSGRADUACAO);
	}
}