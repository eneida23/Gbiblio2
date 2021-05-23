package br.ufba.idp;

import java.util.ArrayList;


public class GerenciarPessoa {
	private ArrayList<Usuario> pessoas;

	 public GerenciarPessoa () 
     { 
             pessoas = new ArrayList<Usuario>();
     }
	
     public ArrayList<Usuario> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Usuario> pessoas) {
		this.pessoas = pessoas;
	}
	
	public int getQuantidade() 
      {
           return pessoas.size();
      }
	 public void incluirPessoa(Usuario pessoa) throws NullPointerException
     {
             if (pessoa == null)
             {
                     throw new NullPointerException("Erro de Objeto Livro null");
             }
             else
             {
                 pessoas.add(pessoa);
             }
     }
	 
	 public Usuario obterPessoa(String cod)
     {
             for(Usuario pessoa : pessoas)
             {
                     if (pessoa != null)
                     {
                             if (pessoa.getCodPessoa() == cod)
                             {
                                     return pessoa;
                             }
                     }
             }
             return null;
     }
	 
	 public ArrayList<Usuario> obterPessoas(String nome)
     {
             ArrayList<Usuario> lista = new ArrayList<Usuario>();
             
             for(Usuario pessoa : pessoas)
             {
                     if (pessoa != null)
                     {
                             if (pessoa.getNome().indexOf(nome) >= 0)
                             {
                                     lista.add(pessoa);
                             }
                     }
             }
             return lista;
             
     }
	 
	 public Usuario getPessoa(int posicao) throws IndexOutOfBoundsException
     {
             if (posicao < this.getQuantidade()) 
                     return pessoas.get(posicao);
             else
                     throw new IndexOutOfBoundsException("Índice da Pessoa Inválido!");
     }
}