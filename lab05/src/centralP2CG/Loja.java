package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

import java.util.ArrayList;

import exceptions.ValorInvalidoException;

public class Loja extends FactoryJogo implements TiposOrdenacaoUsuarios {

	public ArrayList<Usuario> listaDeUsuarios;
	public ArrayList<Jogo> listaDeJogosLoja;

	/**
	 * Construtor defalt.
	 */
	public Loja() {

	}

	/**
	 * Lista dos Jogos.
	 * 
	 * @return listaDeJogosLoja
	 */
	public ArrayList<Jogo> getListaDeJogosLoja() {
		return listaDeJogosLoja;
	}

	public void setListaDeJogosLoja(ArrayList<Jogo> listaDeJogosLoja) {
		this.listaDeJogosLoja = listaDeJogosLoja;
	}

	/**
	 * Armazenar Usuario.
	 * 
	 * @param usuario
	 *            , sera adicionado na lista de usuarios.
	 */
	public void armazenarUsuario(Usuario usuario) {
		listaDeUsuarios.add(usuario);
	}

	/**
	 * Pesquisar Usuario.
	 * 
	 * @param usuario
	 *            , para ser pesquisado.
	 * @return True se a lista conter o usuario, False se nao.
	 */
	public boolean pesquisarUsuario(Usuario usuario) {
		if (listaDeUsuarios.contains(usuario)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param nome
	 *            , novo nome.
	 * @param login
	 *            , novo login.
	 * @param saldo
	 *            , saldo do usuario.
	 * @param tipo
	 *            , Veterano ou Noob.
	 * @throws IllegalAccessException
	 */
	public void criarUsuario(String nome, String login, double saldo,
			String tipo) throws IllegalAccessException {
		if (tipo.equals("UsuarioVeterano")) {
			new UsuarioVeterano(nome, login, saldo);
		}
		if (tipo.equals("UsuarioNoob")) {
			new UsuarioNoob(nome, login, saldo);
		}

	}

	/**
	 * Criar um Jogo
	 * 
	 * @param nomeDoJogo
	 *            , nome do jogo.
	 * @param preco
	 *            , preco do jogo.
	 * @param tipoDeJogo
	 *            , tipo do jogo
	 * @param listaJogabilidade
	 *            , Jogabilidades
	 * @throws Exception
	 */
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

	/**
	 * 
	 * @param usuario
	 *            , usuario que comprara o jogo.
	 * @param jogo
	 *            , jogo que sera vendido.
	 * @throws CloneNotSupportedException
	 */
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

	/**
	 * Adicionar Dinheiro.
	 * 
	 * @param usuario
	 *            , que sera a adicionado dinheiro.
	 * @param dinheiro
	 *            , para adicionar.
	 * @throws ValorInvalidoException
	 */
	public void adicionaDinheiro(Usuario usuario, double dinheiro)
			throws ValorInvalidoException {
		if (listaDeUsuarios.contains(usuario)) {
			usuario.adicionarDinheiro(dinheiro);
		}
	}

	/**
	 * informacoes do Usuario
	 * 
	 * @param usuario
	 *            , pesquisado para dar informacoes.
	 */
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

	public void upgrade(String login) throws Exception {
		for (int i = 0; i < listaDeUsuarios.size(); i++) {
			if (listaDeUsuarios.get(i).getLogin().equals(login)) {
				if ((listaDeUsuarios.get(i).getClass()
						.equals(UsuarioVeterano.class))
						|| (listaDeUsuarios.get(i).getPontosX2P() < 1000)) {
					throw new Exception();

				}
				break;
			}
		}
	}

	/**
	 * Menu da Loja.
	 */
	public void menuLoja() {
		System.out.println("=== Central P2CG ===");

		System.out.println("1- Criar Usuario");
		System.out.println("2- Criar Jogo");
		System.out.println("3- Vender Jogo");
		System.out.println("4- Adicionar Dinheiro");
		System.out.println("5- Sair");

	}

	@Override
	public void ordenaPorX2P() {
		// TODO Auto-generated method stub

	}

}
