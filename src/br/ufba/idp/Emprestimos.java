package br.ufba.idp;


public class Emprestimos {
	private int id; // ID do livro emprestado
	private String codUsuario; // código do usuário que pegou o livro
	private long data_emp; // Data de emprestimo
	private long data_dev; // Prazo maximo de devolução
	private long data_rec; // Data em que o livro foi de fato recebido

	void Emprestimo()
	        {
	            this.codUsuario = null;
	            this.id = -1;
	            this.data_emp = -1;
	            this.data_dev = -1;
	            this.data_rec = -1;
	        }

	void Emprestimo(String codUsuario, int id, long data_emp, long data_dev)
	        {
	            this.codUsuario = codUsuario;
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

	public String getCodUsuario() {
		return codUsuario;
	}

	public long getData_emp() {
		return data_emp;
	}

	public long getData_dev() {
		return data_dev;
	}

	public long getData_rec() {
		return data_rec;
	}

}