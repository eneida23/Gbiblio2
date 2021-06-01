package br.ufba.main;

public class UsuarioProfessor extends Usuario {

	public UsuarioProfessor(Integer codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
		super.setTipo(TipoUsuario.PROFESSOR);
	}
}