package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

import java.util.ArrayList;

import Exceptions.ValorInvalidoException;

public class Loja extends FactoryJogo {

	private ArrayList<Usuario> listaDeUsuarios;

	public void criarUsuario(String nome, String login, double saldo,
			String tipo) throws IllegalAccessException {
		if (tipo.equals("UsuarioVeterano")) {
			new UsuarioVeterano(nome, login, saldo);
		}

	}

	public void criarJogo(String nomeDoJogo, double preco, String tipoDeJogo,
			Jogabilidade listaJogabilidade) throws Exception {

		if (tipoDeJogo.equals("RPG")) {
			criarJogoRPG(nomeDoJogo, preco, tipoDeJogo, listaJogabilidade);
		}
		if (tipoDeJogo.equals("Plataforma")) {
			criarJogoPlataforma(nomeDoJogo, preco, tipoDeJogo,
					listaJogabilidade);
		}
		if (tipoDeJogo.equals("Luta")) {
			criarJogoLuta(nomeDoJogo, preco, tipoDeJogo, listaJogabilidade);
		}
	}

	public void vendeJogo(Usuario usuario, Jogo jogo) {
		if (listaDeUsuarios.contains(usuario)) {
			if (usuario.getSaldo() > jogo.getPreco()) {
				
				//
			}
		}
		(usuario.pontosX2P) = (int) (10 * jogo.getPreco()); 
	}

	public void adicionaDinheiro(Usuario usuario, double dinheiro)
			throws ValorInvalidoException {
		if (listaDeUsuarios.contains(usuario)) {
			usuario.adicionarDinheiro(dinheiro);
		}
	}
	
	

}
