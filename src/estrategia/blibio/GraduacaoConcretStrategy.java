package estrategia.blibio;

import br.ufba.idp.Biblioteca;

public class GraduacaoConcretStrategy implements EmprestimoStrategy{

	@Override
	public void realizarEmprestimo(int codUsuario, int codLivro) {
		// TODO Auto-generated method stub
		if Biblioteca.getInstance().consultarLivro(codLivro);
	}

}
