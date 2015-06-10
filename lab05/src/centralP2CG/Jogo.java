package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

public class Jogo {

	private String nome;
	private double preco;
	private String estilosDoJogo;
	private int qntDeVezesJogadas = 0;
	private int qntDeVezesZerado = 0;
	private double pontuacaoMaxima = 0;
	public Jogabilidade jogabilidade;
	private String tipoDeJogo;

	/**
	 * 
	 * @param nome, Nome do Jogo.
	 * @param preco, Preco do Jogo.
	 * @throws Exception
	 */
	public Jogo(String nome, double preco, String tipoDeJogo) throws Exception {
		this.nome = nome;
		this.preco = preco;
		this.tipoDeJogo = tipoDeJogo;

		if (nome == "" || nome == null)
			throw new Exception("O nome nao pode ser nulo ou vazio. ");
		if (preco <= 0)
			throw new Exception("O preco do jogo tem que ser maior que zero. ");
		if(tipoDeJogo == "" || tipoDeJogo == null)
			throw new Exception("O Tipo do Jogo nao pode ser nulo ou vazio. ");
	}

	public String getTipoDeJogo() {
		return tipoDeJogo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQntDeVezesJogadas() {
		return qntDeVezesJogadas;
	}

	public void setQntDeVezesJogadas(int qntDeVezesJogadas) {
		this.qntDeVezesJogadas = qntDeVezesJogadas;
	}

	public int getQntDeVezesZerado() {
		return qntDeVezesZerado;
	}

	public void setQntDeVezesZerado(int qntDeVezesZerado) {
		this.qntDeVezesZerado = qntDeVezesZerado;
	}

	public double getPontuacaoMaxima() {
		return pontuacaoMaxima;
	}

	public void setPontuacaoMaxima(double pontuacaoMaxima) {
		this.pontuacaoMaxima = pontuacaoMaxima;
	}

	// //////////////////////////////////////////////////////////////////////

	/**
	 * 
	 * @param pontuacaoAtingida, Novo Score.
	 * @param zerado, True se o jogo foi zerado, False se nao.
	 */
	public void joga(double pontuacaoAtingida, boolean zerado) {
		if (pontuacaoAtingida > pontuacaoMaxima)
			pontuacaoMaxima = pontuacaoAtingida;
		if (zerado = true)
			qntDeVezesZerado += 1;
	}

}
