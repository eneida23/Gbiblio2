package br.ufba.idp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	private static Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>();
	private static Map<Integer, Livro> livros = new HashMap<Integer, Livro>();
	private static Map<Integer, Exemplar> exemplares = new HashMap<Integer, Exemplar>();

	private static Biblioteca instance;
	private Biblioteca() 
        { 
               this.usuarios.put(Integer.valueOf(123), new UsuarioGrad(Integer.valueOf(123),"João da Silva"));
               this.usuarios.put(Integer.valueOf(123), new UsuarioProfessor(Integer.valueOf(100),"Carlos Lucena"));
                
               Livro liv100=  new Livro(Integer.valueOf(100),"Engeharia Software", "Ian Sommervile", 2000," Adilson Weley","6ª");
               this.livros.put(Integer.valueOf(100), liv100 );
                
               this.exemplares.put(Integer.valueOf(1), new Exemplar(Integer.valueOf(1), 3,3, liv100));
        }
public static Biblioteca getInstance() {
	if (instance == null) {
		instance = new Biblioteca();}
	return instance;
}

	public static Livro consultarLivro (Integer codigo){	
	
	return this.livros.get(codigo);
	}

/*	public Livro consultarLivroAutor (Integer codigo){	
		
		return this.livros.get(codigo);
		}*/
	}




}
