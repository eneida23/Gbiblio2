package br.ufba.main;

public class Livro {
	private Integer codigo;
	private String titulo;
	private String autor;
	private String editora;
	private String edicao;
	private int anoPublicacao;
	

	public Livro(Integer codigo, String titulo, String autor, int anoPublicacao, String editora, String edicao) {

		setCodigo(codigo);
		setTitulo(titulo);
		setAutor(autor);
		setEditora(editora);
		setAnoPublicacao(anoPublicacao);
		setEdicao(edicao);
		
	}

	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Livro) {
			if (((Livro) obj).getCodigo().equals(this.codigo)) {
				return true;
			}
		}
		
		return false;
	}
}
