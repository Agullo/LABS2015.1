package sp2fy;

public class Musica {

	private String nome;
	private int duracao;
	private String tipo;

	public Musica(String nome, int duracao, String tipo) throws Exception {
		this.nome = nome;
		this.duracao = duracao;
		this.tipo = tipo;

		if (nome == null || nome.equals(""))
			throw new Exception("Titulo não pode ser nulo ou vazio. ");
		if (duracao <= 0)
			throw new Exception("Duracao da musica nao pode ser negativa. ");
		if (tipo == null || tipo.equals(""))
			throw new Exception("Genero da musica nao pode ser vazio. ");
	}

	public String getNome() {
		return nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean equals(Object outro) {
		if (!(outro instanceof Musica))
			return false;

		Musica outraMusica = (Musica) outro;
		if (this.nome.equals(outraMusica.getNome())) {
			return true;
		}
		if(this.duracao == outraMusica.getDuracao()){
			return true;
		}

		return false;
	}

}
