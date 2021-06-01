package br.ufba.blibio.estrategia;

import br.ufba.blibio.singleton.BibliotecaPersistencia;
import br.ufba.main.Exemplar;
import br.ufba.main.Livro;
import br.ufba.main.TipoUsuario;
import br.ufba.main.Usuario;

public class GraduacaoConcretStrategy implements EmprestimoStrategy{

	@Override
	public void realizarEmprestimo(Usuario usuario, Livro livro) {
		if (usuario.getTipo().equals(TipoUsuario.GRADUACAO)) {
			// TODO Auto-generated method stub
			Exemplar e = BibliotecaPersistencia.getInstance().cosultarExemplar(livro.getCodigo()); 
			if (e != null) {
				// Restrições 3.1
				BibliotecaPersistencia.getInstance().realizarEmprestimo(usuario, e);
			}			
		}
	}

}
