package br.ufba.blibio.comando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class InterfaceUsuario {
	private InicializadorComandosInvoker invoker = new InicializadorComandosInvoker(); 
	
	public InterfaceUsuario() {
	}
	
	private String obterComandoConsole() throws ComandoException{
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));			
		} catch (IOException erro) {
			throw new ComandoException(erro.getMessage());
		}
		
				
		System.out.println();
		System.out.println("Digite o comando");
		return teclado.readLine();
		
	}
	
		
	private void executarComando(String nomecomando, int param1, int param2) throws ComandoException{
		Comando comando = invoker.executarComando(nomecomando);
		comando.executar(param1, param2);
	}
	
	private void executarComando(String nomecomando)  throws ComandoException{
		// Executa comando sem parametros
	}
	
	public void realizarLoopIntercaoUsuario(int param1, int param2) throws ComandoException {
		String stringComando = obterComandoConsole();
		
		while (!stringComando.equals("sai")) {
			executarComando(stringComando);
			
			stringComando = obterComandoConsole();
		}
	}
	

}
