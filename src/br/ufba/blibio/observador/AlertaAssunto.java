package br.ufba.blibio.observador;

import java.util.ArrayList;
import java.util.List;

public abstract class AlertaAssunto {
	private List<UsuarioObservador> observadores = new  ArrayList<UsuarioObservador>();
		
	public void addObservador(UsuarioObservador observador) {
	  	this.observadores.add(observador);
	}
	
	public void removeObservador(UsuarioObservador observador) {
		this.observadores.remove(observador);
	}
	
	protected void avisar() {
		for (UsuarioObservador observador :  observadores) {
			observador.atualizar();
		}
	}
}
