package br.ufba.idp;

import java.util.ArrayList;

public class Biblioteca {
	 // testando 
        private ArrayList<Livro> livros;
        
        public Biblioteca() 
        { 
                livros = new ArrayList<Livro>();
        }

        public int getQuantidade() 
        {
                return livros.size();
        }
        
        //teste


        public void incluirLivro(Livro livro) throws NullPointerException
        {
                if (livro == null)
                {
                        throw new NullPointerException("Erro de Objeto Livro null");
                }
                else
                {
                    livros.add(livro);
                }
        }
        
        public Livro obterLivro(int cod)
        {
                for(Livro livro : livros)
                {
                        if (livro != null)
                        {
                                if (livro.getCodigo() == cod)
                                {
                                        return livro;
                                }
                        }
                }
                return null;
        }
        
        public ArrayList<Livro> obterLivro(String tit)
        {
                ArrayList<Livro> lista = new ArrayList<Livro>();
                
                for(Livro livro : livros)
                {
                        if (livro != null)
                        {
                                if (livro.getTitulo().indexOf(tit) >= 0)
                                {
                                        lista.add(livro);
                                }
                        }
                }
                return lista;
        }
        
        public Livro getLivro(int posicao) throws IndexOutOfBoundsException
        {
                if (posicao < this.getQuantidade()) 
                        return livros.get(posicao);
                else
                        throw new IndexOutOfBoundsException("Índice de Livro Inválido!");
        }
        
}
