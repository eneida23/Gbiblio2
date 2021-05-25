package br.ufba.idp;

import java.time.LocalDateTime;

public class Emprestimos {
	private int id; // ID do livro emprestado
	private Usuario usuarioemprestimo; 
	private LocalDateTime data_emp; // Data de emprestimo
	private long data_dev; // Prazo maximo de devolução
	private long data_rec; // Data em que o livro foi de fato recebido

	
	void Emprestimo(Usuario usuarioemprestimo, int id, LocalDateTime data_emp, long data_dev)
	        {
	            this.usuarioemprestimo = usuarioemprestimo;
	            this.id = id;
	            this.data_emp = data_emp;
	            this.data_dev = data_dev;
	            this.data_rec = -1;
	       }

	// Registra a data em que o livro for de fato recebido de volta
	public void devolve(long data) {
		this.data_rec = data;
	}

	// Checa se ja foi devolvido
	public boolean devolvido() {
		return data_rec >= 0;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getData_emp() {
		return data_emp;
	}

	public long getData_dev() {
		return data_dev;
	}

	public long getData_rec() {
		return data_rec;
	}

	public Usuario getUsuarioemprestimo() {
		return usuarioemprestimo;
	}

	public void setUsuarioemprestimo(Usuario usuarioemprestimo) {
		this.usuarioemprestimo = usuarioemprestimo;
	}
	public void emprestar(Usuario usuarioemprestimo) {
        this.usuarioemprestimo = usuarioemprestimo;
        this.data_emp = LocalDateTime.now();
    }

}