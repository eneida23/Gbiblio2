package estrategia.blibio;

import singleton.blibio.Biblioteca;

public class GraduacaoConcretStrategy implements EmprestimoStrategy{

	@Override
	public void realizarEmprestimo(int codUsuario, int codLivro) {
		// TODO Auto-generated method stub
		if (Biblioteca.getInstance().cosultarExemplar(codLivro) != null) {
			
		}
	}

}
