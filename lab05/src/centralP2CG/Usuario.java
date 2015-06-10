package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

import java.util.ArrayList;

import Exceptions.ValorInvalidoException;

public class Usuario {

	private String nome;
	private String login;
	protected double saldo;
	public int pontosX2P = 0;
	protected ArrayList<Jogo> jogosUsuario;

	public Usuario(String nome, String login, double saldo)
			throws IllegalAccessException {
		this.nome = nome;
		this.login = login;
		this.saldo = saldo;

		if (nome == "" || nome == null)
			throw new IllegalAccessException();
		if (login == "" || login == null)
			throw new IllegalAccessError();
		if (saldo <= 0)
			throw new IllegalAccessError();
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getPontosX2P() {
		return pontosX2P;
	}

	public ArrayList<Jogo> getJogosUsuario() {
		return jogosUsuario;
	}

	public void comprarJogo(Jogo novoJogo) {
		if (jogosUsuario.contains(novoJogo)) {
			if (saldo >= novoJogo.getPreco()) {
				jogosUsuario.add(novoJogo);
			}
		}
	}

	public void jogar(String nomeDoJogo, int pontuacaoMaxima, boolean zerou){
		if(jogosUsuario.contains(nomeDoJogo)){
		}
	}
	
	
	
	public void adicionarDinheiro(double dinheiro)
			throws ValorInvalidoException {
		if (dinheiro <= 0)
			throw new ValorInvalidoException("Valor Invalido");
	}

	public void recompensar(String nomeJogo, int scoreObtido, boolean zerou) {

	}

	public void punir(String nomeJogo, int scoreObtido, boolean zerou) {

	}
}
