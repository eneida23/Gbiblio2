package br.ufba.blibio.comando;

import br.ufba.blibio.fachada.BibliotecaFachada;

public class RealizarDevolucao extends Comando {

	public void executar() throws ComandoException{
		BibliotecaFachada.obterInstancia().realizarDevolucao();

	}

}
