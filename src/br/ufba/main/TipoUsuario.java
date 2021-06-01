package br.ufba.main;

public enum TipoUsuario {
	GRADUACAO("Aluno de Graduacao"),
	POSGRADUACAO("Aluno de Pos-Graduacao"),
	PROFESSOR("Professor");
	
	private String tipo;

	TipoUsuario(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return tipo;
	}
}
