package comando.blibio;

public class RealizarEmprestimo implements Comando {

	public void executar(int codUsuario, int codLivro) {
		BibliotecaFachada.obterInstancia().realizarEmprestimo();

	}

}
