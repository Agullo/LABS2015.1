package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

import java.util.ArrayList;

import Exceptions.ValorInvalidoException;

public class Loja extends FactoryJogo {

	private ArrayList<Usuario> listaDeUsuarios;
	private ArrayList<Jogo> listaDeJogosLoja;

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

	public void vendeJogo(Usuario usuario, Jogo jogo)
			throws CloneNotSupportedException {
		if (listaDeUsuarios.contains(usuario)) {
			if (usuario.getSaldo() > jogo.getPreco()) {
				Jogo copia = (Jogo) jogo.clone();
				usuario.jogosUsuario.add(copia);
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

	public void informacoesUsuario(Usuario usuario) {
		System.out.println("=== Central P2-CG ===");
		System.out.println("");
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getNome() + "-");
		System.out.println("Lista de Jogos:");
		for (int i = 0; i < usuario.getJogosUsuario().size(); i++) {
			System.out.println("+" + usuario.jogosUsuario.get(i).getNome()
					+ usuario.jogosUsuario.get(i).getTipoDeJogo());
			System.out.println("==> Jogou"
					+ usuario.jogosUsuario.get(i).getQntDeVezesJogadas()
					+ " vez(es)");
			System.out.println("==> Zerou"
					+ usuario.jogosUsuario.get(i).getQntDeVezesZerado()
					+ " vez(es)");
			System.out.println("==> Maior score: "
					+ usuario.jogosUsuario.get(i).getPontuacaoMaxima());

		}
	}

}
