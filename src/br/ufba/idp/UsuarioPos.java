package br.ufba.idp;

public class UsuarioPos extends Usuario implements IUsuario {
	
	private int tempoEmprestimoEmDias = 4;
	@Override
	public int getTempoEmprestimoEmDias() {
		// TODO Auto-generated method stub
		return this.tempoEmprestimoEmDias;
	}

}
