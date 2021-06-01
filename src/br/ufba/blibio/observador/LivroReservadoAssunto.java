package br.ufba.blibio.observador;

import br.ufba.blibio.singleton.BibliotecaPersistencia;
import br.ufba.main.Livro;

public class LivroReservadoAssunto extends AlertaAssunto {
	private Livro livro;
	
	public void setReservaLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void isReservaSimultatena() {
		int qtdReserva = BibliotecaPersistencia.getInstance().cosultarQtReservas(this.livro);
		if (qtdReserva == 2) {
			avisar();
		}
	}
}
