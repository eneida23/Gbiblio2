package br.ufba.blibio.comando;

import br.ufba.blibio.fachada.BibliotecaFachada;
import br.ufba.blibio.fachada.FachadaException;

public class EmprestimoComando extends Comando {

	public void executar() throws ComandoException {
		try {
			BibliotecaFachada.obterInstancia().realizarEmprestimo(getCodigoUsu(),getCodigoLivro());
		} catch (FachadaException erro) {
			throw new ComandoException(erro.getMessage());
		}
	}

}
