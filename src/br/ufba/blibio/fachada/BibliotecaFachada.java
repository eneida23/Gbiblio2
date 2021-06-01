package br.ufba.blibio.fachada;

import br.ufba.blibio.estrategia.EmprestimoContext;
import br.ufba.blibio.estrategia.GraduacaoConcretStrategy;
import br.ufba.blibio.estrategia.PosGraduacaoConcretStrategy;
import br.ufba.blibio.estrategia.ProfessorConcretStrategy;
import br.ufba.blibio.singleton.BibliotecaPersistencia;
import br.ufba.main.Livro;
import br.ufba.main.Usuario;

public class BibliotecaFachada {
	private static BibliotecaFachada instancia;
		
	private BibliotecaFachada() {}
	
	public static BibliotecaFachada obterInstancia() {
		if (instancia == null) {
			instancia = new BibliotecaFachada();
			
		}
		return instancia;
	}
	
	public void realizarEmprestimo(int codUsuario, int codLivro) throws FachadaException{
		System.out.println("Realizando Emprestimo...");
		
		Usuario usuario = BibliotecaPersistencia.getInstance().consultarUsuario(codUsuario);
		
		if (usuario == null)
			throw new FachadaException("Usuario Inexistente");
		
		Livro livro = BibliotecaPersistencia.getInstance().consultarLivro(codLivro);
		
		if (livro == null)
			throw new FachadaException("Livro Inexistente");
				
		EmprestimoContext emp_context = new EmprestimoContext(new GraduacaoConcretStrategy());
		emp_context.realizarEmprestimo(usuario, livro);
		
		emp_context = new EmprestimoContext(new PosGraduacaoConcretStrategy());
		emp_context.realizarEmprestimo(usuario, livro);
		
		emp_context = new EmprestimoContext(new ProfessorConcretStrategy());
		emp_context.realizarEmprestimo(usuario, livro);		
	}
	
	public void realizarReserva() {
		System.out.println("Realizando Reserva...");
	}
	public void realizarDevolucao() {
		System.out.println("Realizando Devolucao...");
	}

}
