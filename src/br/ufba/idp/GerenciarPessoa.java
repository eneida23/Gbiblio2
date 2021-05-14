package br.ufba.idp;

import java.util.ArrayList;
// testando 

public class GerenciarPessoa {
	private ArrayList<Pessoa> pessoas;

	 public GerenciarPessoa () 
     { 
             pessoas = new ArrayList<Pessoa>();
     }
	
     public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public int getQuantidade() 
      {
           return pessoas.size();
      }
	 public void incluirPessoa(Pessoa pessoa) throws NullPointerException
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
	 
	 public Pessoa obterPessoa(String cod)
     {
             for(Pessoa pessoa : pessoas)
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
	 
	 public ArrayList<Pessoa> obterPessoas(String nome)
     {
             ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
             
             for(Pessoa pessoa : pessoas)
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
	 
	 public Pessoa getPessoa(int posicao) throws IndexOutOfBoundsException
     {
             if (posicao < this.getQuantidade()) 
                     return pessoas.get(posicao);
             else
                     throw new IndexOutOfBoundsException("Índice da Pessoa Inválido!");
     }
}