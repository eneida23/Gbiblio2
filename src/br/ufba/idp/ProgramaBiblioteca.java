package br.ufba.idp;

import javax.swing.JOptionPane;

public class ProgramaBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblio = new Biblioteca();
		GerenciarPessoa gpessoa = new GerenciarPessoa();
        JOptionPane.showMessageDialog(null, "* Bem-vindo ao Sistema Biblioteca !\n"+
               "* Prática de Padrões de Projeto\n", null, JOptionPane.INFORMATION_MESSAGE);
                 
        Livro livro;
        Pessoa pessoa;
//        ArrayList<Livro> listaLivros;
        int opcao = 0;
        String opcoes = 
          "\n\n***Opções*** "+
          "\n1. Cadastrar Livro"+
          "\n2. Listar Livros"+
          "\n3. Cadastrar Pessoa"+
          "\n4. Listar Pessoa"+
          "\n5. Finalizar"+
          "\n\nSelecione a opção: ";

        while (opcao != 5) 
        {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
                                JOptionPane.QUESTION_MESSAGE));
        
                switch(opcao)
                {
                  case 1:
                      try 
                      {
                        biblio.incluirLivro(digitarLivro());                                  
                      }
                      catch(NullPointerException ex)
                      {
                          ex.printStackTrace();
                      }
                      catch(ArrayIndexOutOfBoundsException ex)
                      {
                          
                      }
                      catch(Exception ex)
                      {
                          
                      }
                        JOptionPane.showMessageDialog(null, "Livro Cadastrado!\nTotal: "+
                                        biblio.getQuantidade()+" livro(s)");
                        break;
             
                  case 2:
                  {
                          StringBuffer lista = new StringBuffer();
                          lista.append("Lista de Livros Cadastrados:\n");
                          for (int i=0;i<biblio.getQuantidade();i++)
                          {
                                  livro = biblio.getLivro(i);
                                  lista.append(livro.getCodigo()+" - "+
                                                  livro.getTitulo()+" - "+livro.getAutor()+" - "+ livro.getEditora()+" - "+
                                                  " - Ano \n"+ livro.getAnoPublicacao() + " - ");
                          }
                          lista.append("Total: "+biblio.getQuantidade()+" livro(s)");
                          JOptionPane.showMessageDialog(null, lista.toString());
                          break;
                  }
                  case 3:
                      try 
                      {
                        gpessoa.incluirPessoa(digitarPessoa());                                  
                      }
                      catch(NullPointerException ex)
                      {
                          ex.printStackTrace();
                      }
                      catch(ArrayIndexOutOfBoundsException ex)
                      {
                          
                      }
                      catch(Exception ex)
                      {
                          
                      }
                        JOptionPane.showMessageDialog(null, "Pessoa Cadastrada!\nTotal: "+
                                        gpessoa.getQuantidade()+" pessoa(s)");
                        break;
                             
        case 4:
        
                StringBuffer lista = new StringBuffer();
                lista.append("Lista de Pessoas Cadastrados:\n");
                for (int i=0;i<gpessoa.getQuantidade();i++)
                {
                        pessoa = gpessoa.getPessoa(i);
                        lista.append(pessoa.getCodPessoa()+" - "+
                                        pessoa.getNome()) ;
                }
                lista.append("Total: "+gpessoa.getQuantidade()+" livro(s)");
                JOptionPane.showMessageDialog(null, lista.toString());
                break;
        }
        }
        System.out.println("# Fim do Programa #");
        }
    

static Livro digitarLivro()
{
        Livro liv = new Livro();
        liv.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do Livro:")));
        liv.setTitulo(JOptionPane.showInputDialog("Título do Livro:"));
        liv.setAutor(JOptionPane.showInputDialog("Autor do Livro:"));
        liv.setEditora(JOptionPane.showInputDialog("Editora do Livro:"));
        liv.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Ano de Publicação :")));
        return liv;
        
        
}

static Pessoa digitarPessoa()
{
        Pessoa pes = new Pessoa(null, null);
        pes.setCodPessoa(JOptionPane.showInputDialog("Código da Pessoa:"));
        pes.setNome(JOptionPane.showInputDialog("Nome da Pessoa:"));
              
        return pes;
        
        
}
static void mostrarLivro(Livro x,String bib)
{
        String texto = "Livro:\n"+
        "\nCódigo: "+x.getCodigo()+
        "\nTítulo: "+x.getTitulo()+
        "\nAutor: "+x.getAutor()+
        "\nEditora "+x.getEditora()+
        "\nAnoPublicação "+x.getAnoPublicacao();
        JOptionPane.showMessageDialog(null, texto, "Biblioteca: "+bib,
                        JOptionPane.WARNING_MESSAGE);
}

	}


