	package br.ufba.blibio.comando;

import java.util.HashMap;

public class InicializadorComandosInvoker {
	private HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	
	public InicializadorComandosInvoker() {
		comandos.put("emp", new EmprestimoComando());
		comandos.put("res", new RealizarReserva());
		comandos.put("dev", new RealizarDevolucao());
	}
	
	public void defineComando(String comando) throws ComandoException{
		Comando temp = comandos.get(comando);
		
		if (temp == null)
			throw new ComandoException("Comando inexistente");
		
		temp.executar();
	}

}
