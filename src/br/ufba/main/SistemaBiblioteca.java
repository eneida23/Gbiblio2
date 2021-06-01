package br.ufba.main;

import java.io.IOException;

import br.ufba.blibio.comando.InterfaceUsuario;

public class SistemaBiblioteca {

	public static void main(String[] args) throws IOException {
		InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
		interfaceUsuario.realizarLoopIntercaoUsuario();

	}

}
