package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

abstract class FactoryJogo {


	 void criarJogoRPG(String nome, double preco, String tipoDeJogo, Jogabilidade listJogabilidade)
			throws Exception {
		new RPG(nome, preco);
	}

	 void criarJogoLuta(String nome, double preco, String tipoDeJogo, Jogabilidade listJogabilidade)
			throws Exception {
		new Luta(nome, preco);
	}

	void criarJogoPlataforma(String nome, double preco, String tipoDeJogo, Jogabilidade listJogabilidade)
			throws Exception {
		new Plataforma(nome, preco);

	}

	// loja.criaJogo("Super Mario", 40.00, "Plataforma", listaEstilo);
}
