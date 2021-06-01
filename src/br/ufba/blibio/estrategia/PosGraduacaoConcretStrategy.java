package br.ufba.blibio.estrategia;

import br.ufba.main.Livro;
import br.ufba.main.TipoUsuario;
import br.ufba.main.Usuario;

public class PosGraduacaoConcretStrategy implements EmprestimoStrategy {

	@Override
	public void realizarEmprestimo(Usuario usuario, Livro livro) {
		if (usuario.getTipo().equals(TipoUsuario.POSGRADUACAO)) {
			// Lógica de negócio...
		}
	}

}
