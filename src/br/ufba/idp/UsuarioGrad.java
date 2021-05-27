package br.ufba.idp;

public class UsuarioGrad extends Usuario implements IUsuario{
	
	private int tempoEmprestimoEmDias = 3;
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
