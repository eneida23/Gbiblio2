package br.ufba.blibio.observador;

public class ProfessorConcreteObservador extends UsuarioObservador {
	private LivroReservadoAssunto reservaLivro = new LivroReservadoAssunto();

	@Override
	public void atualizar() {
		this.reservaLivro.isReservaSimultatena();

	}

}
