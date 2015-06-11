package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

public class UsuarioVeterano extends Usuario {

	public UsuarioVeterano(String nome, String login, double saldo)
			throws IllegalAccessException {
		super(nome, login, saldo);
	}

	@Override
	public void comprarJogo(Jogo novoJogo) {
		double valorDesconto = ((20 / 100) * novoJogo.getPreco());
		double novoJogoDescontoVeterano = (novoJogo.getPreco() - valorDesconto);
		if (saldo >= novoJogoDescontoVeterano) {
			jogosUsuario.add(novoJogo);
		}
	}

	public int recompensar(String nomeJogo, int scoreObtido, Boolean zerou) {

		int pontos = 0;
		for (int i = 0; i < getJogosUsuario().size(); i++) {
			if (getJogosUsuario().get(i).getNome().equals(nomeJogo)) {
				for (int j = 0; j < getJogosUsuario().get(i).getJogabilidade()
						.size(); j++) {
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.ONLINE) {
						pontos = pontos + 10;
					}
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.COOPERATIVO) {
						pontos = pontos + 20;
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
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.COMPETITIVO) {
						pontos = pontos - 20;
					}
					if (getJogosUsuario().get(i).getJogabilidade().get(j) == Jogabilidade.COOPERATIVO) {
						pontos = pontos - 20;
					}
				}
			}
		}
		return pontos;
	}

}
