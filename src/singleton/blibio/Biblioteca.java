package singleton.blibio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufba.idp.Exemplar;
import br.ufba.idp.Livro;
import br.ufba.idp.Usuario;
import br.ufba.idp.UsuarioGrad;
import br.ufba.idp.UsuarioPos;
import br.ufba.idp.UsuarioProfessor;

public class Biblioteca {
	private static Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>();
	private static Map<Integer, Livro> livros = new HashMap<Integer, Livro>();
	private static Map<Integer, Exemplar> exemplares = new HashMap<Integer, Exemplar>();
	private static Map<Usuario, List<Exemplar> > emprestimos = new HashMap<Usuario, List<Exemplar>>();
	private static Biblioteca instance;
	
	private Biblioteca() {
		this.usuarios.put(Integer.valueOf(123), new UsuarioGrad(Integer.valueOf(123), "João da Silva"));
		this.usuarios.put(Integer.valueOf(789), new UsuarioGrad(Integer.valueOf(789), "Pedro Paulo"));
		this.usuarios.put(Integer.valueOf(100), new UsuarioProfessor(Integer.valueOf(100), "Carlos Lucena"));
		this.usuarios.put(Integer.valueOf(456), new UsuarioPos(Integer.valueOf(456), "Luis Fernado Rodrigues"));

		Livro liv100 = new Livro(Integer.valueOf(100), "Engeharia Software", "Ian Sommervile", 2000, " Adilson Weley",
				"6ª");
		this.livros.put(Integer.valueOf(100), liv100);
		Livro liv101 = new Livro(Integer.valueOf(101), "UML – Guia do Usuário", "Grady Booch", 2000, " Campus", "7ª");
		this.livros.put(Integer.valueOf(101), liv101);
		Livro liv200 = new Livro(Integer.valueOf(200), "Code Complete", "Steve McConnell", 2014, " Microsof Press",
				"2ª");
		this.livros.put(Integer.valueOf(200), liv200);
		Livro liv201 = new Livro(Integer.valueOf(201), "Agile Software", "Robert Martin", 2002, "Prentice Hall", "1ª");
		this.livros.put(Integer.valueOf(201), liv201);

		this.exemplares.put(Integer.valueOf(1), new Exemplar(Integer.valueOf(1), 3, 3, liv100));
		this.exemplares.put(Integer.valueOf(2), new Exemplar(Integer.valueOf(2), 2, 2, liv101));
		this.exemplares.put(Integer.valueOf(3), new Exemplar(Integer.valueOf(3), 2, 2, liv200));
	}

	public static Biblioteca getInstance() {
		if (instance == null) {
			instance = new Biblioteca();
		}
		return instance;
	}

	public static Livro consultarLivro(Integer codigo) {

		return livros.get(codigo);
	}

	public static Exemplar cosultarExemplar(int codigo) {
		for (Exemplar exemplar : exemplares.values()) {
			if (exemplar.getLivro().getCodigo().intValue() == codigo) {
				if (exemplar.getQtdisponiveis() > 0) {
					return exemplar;
				}
			}

		}
		return null;
	}
public static void realizarEmprestimo(Usuario usuario,List <Exemplar> exemplar) {

	emprestimos.get(usuario).add((Exemplar) exemplar);

}
}

