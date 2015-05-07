package sp2fy;

public class Musica {

	private String nome;
	private int duracao;
	private String tipo;

	public Musica(String nome, int duracao, String tipo) throws Exception {
		this.nome = nome;
		this.duracao = duracao;
		this.tipo = tipo;

		verificaErroNome(nome);
		verificaErroDuracao(duracao);
		verificaErroTipo(tipo);
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
		if (this.duracao == outraMusica.getDuracao()) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return nome;
	}

	private void verificaErroNome(String nome) throws Exception {
		if (nome == null || nome.equals(""))
			throw new Exception("Titulo não pode ser nulo ou vazio. ");
	}

	private void verificaErroDuracao(int duracao) throws Exception {
		if (duracao <= 0)
			throw new Exception("Duracao da musica nao pode ser negativa. ");
	}

	private void verificaErroTipo(String tipo) throws Exception {
		if (tipo == null || tipo.equals(""))
			throw new Exception("Genero da musica nao pode ser vazio. ");
	}

}
