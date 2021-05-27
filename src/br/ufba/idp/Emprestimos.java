package br.ufba.idp;

import java.time.LocalDateTime;

public class Emprestimos {
	private int id; // ID do livro emprestado
	private Usuario usuario;
	private Livro livro;
	private LocalDateTime data_emp; // Data de emprestimo
	private long data_dev; // Prazo maximo de devolução
	private long data_rec; // Data em que o livro foi de fato recebido

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDateTime getData_emp() {
		return data_emp;
	}

	public void setData_emp(LocalDateTime data_emp) {
		this.data_emp = data_emp;
	}

	public long getData_dev() {
		return data_dev;
	}

	public void setData_dev(long data_dev) {
		this.data_dev = data_dev;
	}

	// Registra a data em que o livro for de fato recebido de volta
	public void devolve(long data) {
		this.data_rec = data;
	}

	// Checa se ja foi devolvido
	public boolean devolvido() {
		return data_rec >= 0;
	}

}