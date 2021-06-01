package br.ufba.blibio.estrategia;

import br.ufba.main.Livro;
import br.ufba.main.Usuario;

public interface EmprestimoStrategy {
public void realizarEmprestimo(Usuario usuario, Livro livro);
}
