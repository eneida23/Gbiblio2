package br.ufba.idp;

import javax.swing.JOptionPane;

import singleton.blibio.Biblioteca;

// testando 
public class ProgramaBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblio = new Biblioteca();
		GerenciarUsuario gpessoa = new GerenciarUsuario();
		JOptionPane.showMessageDialog(null,
				"* Bem-vindo ao Sistema comando.blibio !\n" + "* Prática de Padrões de Projeto\n", null,
				JOptionPane.INFORMATION_MESSAGE);

		Livro livro;
		Usuario pessoa;
//        ArrayList<Livro> listaLivros;
		int opcao = 0;
		String opcoes = "\n\n***Opções*** " + "\n1. Cadastrar Livro" + "\n2. Listar Livros" + "\n3. Cadastrar Usuario"
				+ "\n4. Listar Usuario" + "\n5. Finalizar" + "\n\nSelecione a opção: ";

		while (opcao != 5) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, JOptionPane.QUESTION_MESSAGE));

			switch (opcao) {
			case 1:
				try {
					biblio.incluirLivro(digitarLivro());
				} catch (NullPointerException ex) {
					ex.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException ex) {

				} catch (Exception ex) {

				}
				JOptionPane.showMessageDialog(null,
						"Livro Cadastrado!\nTotal: " + biblio.getQuantidade() + " livro(s)");
				break;

			case 2: {
				StringBuffer lista = new StringBuffer();
				lista.append("Lista de Livros Cadastrados:\n");
				for (int i = 0; i < biblio.getQuantidade(); i++) {
					livro = biblio.getLivro(i);
					lista.append(livro.getCodigo() + " - " + livro.getTitulo() + " - " + livro.getAutor() + " - "
							+ livro.getEditora() + " - " + " - Ano \n" + livro.getAnoPublicacao() + " - ");
				}
				lista.append("Total: " + biblio.getQuantidade() + " livro(s)");
				JOptionPane.showMessageDialog(null, lista.toString());
				break;
			}
			case 3:
				try {
					gpessoa.incluirUsuario(digitarPessoa());
				} catch (NullPointerException ex) {
					ex.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException ex) {

				} catch (Exception ex) {

				}
				JOptionPane.showMessageDialog(null,
						"Pessoa Cadastrada!\nTotal: " + gpessoa.getQuantidade() + " pessoa(s)");
				break;

			case 4:

				StringBuffer lista = new StringBuffer();
				lista.append("Lista de Pessoas Cadastrados:\n");
				for (int i = 0; i < gpessoa.getQuantidade(); i++) {
					pessoa = gpessoa.getUsuario(i);
					lista.append(pessoa.getCodUsuario() + " - " + pessoa.getNome());
				}
				lista.append("Total: " + gpessoa.getQuantidade() + " livro(s)");
				JOptionPane.showMessageDialog(null, lista.toString());
				break;
			}
		}
		System.out.println("# Fim do Programa #");
	}

	static Livro digitarLivro() {
		Livro liv = new Livro(0, null, null, 0, null);
		liv.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do Livro:")));
		liv.setTitulo(JOptionPane.showInputDialog("Título do Livro:"));
		liv.setAutor(JOptionPane.showInputDialog("Autor do Livro:"));
		liv.setEditora(JOptionPane.showInputDialog("Editora do Livro:"));
		liv.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Ano de Publicação :")));
		return liv;

	}

	static Usuario digitarPessoa() {
		UsuarioGrad pes = new UsuarioGrad();
		pes.setCodUsuario(JOptionPane.showInputDialog("Código da Pessoa:"));
		pes.setNome(JOptionPane.showInputDialog("Nome da Pessoa:"));
		return pes;

	}

	static void mostrarLivro(Livro x, String bib) {
		String texto = "Livro:\n" + "\nCódigo: " + x.getCodigo() + "\nTítulo: " + x.getTitulo() + "\nAutor: "
				+ x.getAutor() + "\nEditora " + x.getEditora() + "\nAnoPublicação " + x.getAnoPublicacao();
		JOptionPane.showMessageDialog(null, texto, "comando.blibio: " + bib, JOptionPane.WARNING_MESSAGE);
	}

}
