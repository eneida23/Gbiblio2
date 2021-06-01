package br.ufba.main;

import java.util.ArrayList;


public class GerenciarUsuario {
	private ArrayList<Usuario> usuarios;

	 public GerenciarUsuario () 
     { 
             usuarios = new ArrayList<Usuario>();
     }
	
     public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public int getQuantidade() 
      {
           return usuarios.size();
      }
	 public void incluirUsuario(Usuario usuario) throws NullPointerException
     {
             if (usuario == null)
             {
                     throw new NullPointerException("Erro de Objeto Livro null");
             }
             else
             {
                 usuarios.add(usuario);
             }
     }
	 
	 public Usuario obterUsuario(String cod)
     {
             for(Usuario usuario : usuarios)
             {
                     if (usuario != null)
                     {
                             if (usuario.getCodUsuario() == cod)
                             {
                                     return usuario;
                             }
                     }
             }
             return null;
     }
	 
	 public ArrayList<Usuario> obterUsuarios(String nome)
     {
             ArrayList<Usuario> lista = new ArrayList<Usuario>();
             
             for(Usuario usuario : usuarios)
             {
                     if (usuario != null)
                     {
                             if (usuario.getNome().indexOf(nome) >= 0)
                             {
                                     lista.add(usuario);
                             }
                     }
             }
             return lista;
             
     }
	 
	 public Usuario getUsuario(int posicao) throws IndexOutOfBoundsException
     {
             if (posicao < this.getQuantidade()) 
                     return usuarios.get(posicao);
             else
                     throw new IndexOutOfBoundsException("�ndice da Pessoa Inv�lido!");
     }
}