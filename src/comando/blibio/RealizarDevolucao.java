package comando.blibio;

public class RealizarDevolucao implements Comando {

	public void executar() {
		BibliotecaFachada.obterInstancia().realizarDevolucao();

	}

}
