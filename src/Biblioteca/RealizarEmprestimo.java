package Biblioteca;

public class RealizarEmprestimo implements Comando {

	public void executar() {
		BibliotecaFachada.obterInstancia().realizarEmprestimo();

	}

}
