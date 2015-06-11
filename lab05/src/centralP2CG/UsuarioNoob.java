package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

public class UsuarioNoob extends Usuario {

	public UsuarioNoob(String nome, String login, double saldo)
			throws IllegalAccessException {
		super(nome, login, saldo);
	}

	@Override
	public void comprarJogo(Jogo novoJogo) {
		double valorDesconto = ((10 / 100) * novoJogo.getPreco());
		double novoJogoDescontoNoob = (novoJogo.getPreco() - valorDesconto);
		if (saldo >= novoJogoDescontoNoob) {
			jogosUsuario.add(novoJogo);
		}
	}

	@Override
	public int recompensar(String nomeJogo, int scoreObtido, Boolean zerou) {

		int pontos = 0;
		for (int i = 0; i < getJogosUsuario().size(); i++) {
			if (getJogosUsuario().get(i).getNome().equals(nomeJogo)) {
				for (int j = 0; j < getJogosUsuario().get(i).getJogabilidade()
						.size(); j++) {
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.OFFLINE) {
						pontos = pontos + 30;
					}
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.MULTIPLAYER) {
						pontos = pontos + 10;
					}

				}
				break;
			}
		}
		return pontos;
	}

	@Override
	public int punir(String nomeJogo, int scoreObtido, Boolean zerou) {

		int pontos = 0;
		for (int i = 0; i < getJogosUsuario().size(); i++) {
			if (getJogosUsuario().get(i).getNome().equals(nomeJogo)) {
				for (int j = 0; j < getJogosUsuario().get(i).getJogabilidade()
						.size(); j++) {
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.ONLINE) {
						pontos = pontos - 10;
					}
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.COMPETITIVO) {
						pontos = pontos - 20;
					}
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.COOPERATIVO) {
						pontos = pontos - 50;
					}
				}
			}
		}
		return pontos;
	}

}
