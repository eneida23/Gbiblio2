package br.ufba.idp;

public class UsuarioProfessor extends Usuario implements IUsuario {
	
	private int tempoEmprestimoEmDias = 7;
	@Override
	public int getTempoEmprestimoEmDias() {
		// TODO Auto-generated method stub
		return this.tempoEmprestimoEmDias;
	}

	@Override
	public int getQtLimiteEmprestimos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
