package br.ufba.idp;

import java.util.ArrayList;
import java.util.Map;

public class GerenciarEmprestimo {
        
        private Map<String, Usuario> usuarios;
        private Map<Integer, Livro> livros;
        
                       
        private int i = 0; //incrementa o id do emprestimo
        //cria listas
        private ArrayList<Emprestimos> emprestimos = new ArrayList<Emprestimos>();
        private ArrayList<Emprestimos> devolucoes = new ArrayList<Emprestimos>();

        public ArrayList<Emprestimos> getEmprestimos() {
        return emprestimos;
        }
        public void setEmprestimos(ArrayList<Emprestimos> emprestimos) {
        this.emprestimos = emprestimos;
        }
        public ArrayList<Emprestimos> getDevolucoes() {
        return devolucoes;
        }
        public void setDevolucoes(ArrayList<Emprestimos> devolucoes) {
        this.devolucoes = devolucoes;
        }
}
