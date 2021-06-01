package br.ufba.main;

import java.time.LocalDateTime;
import java.util.Date;

public class Emprestimos {
	private int id; // ID do emprestimo
	private Usuario usuario;
	// private Livro livro;
	private Exemplar exemplar;
	private LocalDateTime data_emp; // Data de emprestimo
	private Date data_dev; // Prazo maximo de devolu��o
	private Date data_rec; // Data em que o livro foi de fato recebido

	/*
	 * public Emprestimos() { }
	 */

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

	public LocalDateTime getData_emp() {
		return data_emp;
	}

	public void setData_emp(LocalDateTime data_emp) {
		this.data_emp = data_emp;
	}

	public Date getData_dev() {
		return data_dev;
	}

	public void setData_dev(Date data_dev) {
		this.data_dev = data_dev;
	}

	// Registra a data em que o livro for de fato recebido de volta
	public void devolve(Date data) {
		this.setData_rec(data);
	}

	// Checa se ja foi devolvido
	/*
	 * public boolean devolvido() { return data_rec >= 0; }
	 */

	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	public Date getData_rec() {
		return data_rec;
	}

	public void setData_rec(Date data_rec) {
		this.data_rec = data_rec;
	}

}