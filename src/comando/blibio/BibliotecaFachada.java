package comando.blibio;

import estrategia.blibio.GraduacaoConcretStrategy;

public class BibliotecaFachada {
	private static BibliotecaFachada instancia;
	
	private BibliotecaFachada() {}
	
	public static BibliotecaFachada obterInstancia() {
		if (instancia == null) {
			instancia = new BibliotecaFachada();
			
		}
		return instancia;
	}
	public void realizarEmprestimo(int codUsuario, int codLivro) {
		GraduacaoConcretStrategy usugrad = new GraduacaoConcretStrategy();
		usugrad.realizarEmprestimo(codUsuario, codLivro);
		System.out.println("Realizando Emprestimo...");
	}
	public void realizarReserva() {
		System.out.println("Realizando Reserva...");
	}
	public void realizarDevolucao() {
		System.out.println("Realizando Devolução...");
	}

}
