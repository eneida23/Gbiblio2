package br.ufba.blibio.estrategia;

import br.ufba.main.Livro;
import br.ufba.main.Usuario;

public class EmprestimoContext {
	private EmprestimoStrategy stratgy = null;
	
	public EmprestimoContext(EmprestimoStrategy stratgy) {
		this.stratgy = stratgy;
	}

	public void realizarEmprestimo(Usuario usuario, Livro livro) {
		stratgy.realizarEmprestimo(usuario, livro);
	}

}
