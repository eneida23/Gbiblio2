package br.ufba.main;

public class Teste {
	
	public static Usuario getUsuario() {
		return new UsuarioGrad(1, "Fulano");
	}

	public static void main(String[] args) {
		if (getUsuario() instanceof UsuarioGrad) {
			UsuarioGrad new_name = (UsuarioGrad) getUsuario();
			System.out.println("G");
		}else {
			System.out.println("U");
		}

	}

}
