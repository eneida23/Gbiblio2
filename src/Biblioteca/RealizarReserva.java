package Biblioteca;

public class RealizarReserva implements Comando {

	public void executar() {
		BibliotecaFachada.obterInstancia().realizarReserva();
	}

}