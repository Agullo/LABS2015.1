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
	public void recompensar(String nomeJogo, int scoreObtido, boolean zerou) {
		if(jogosUsuario.contains(nomeJogo)){
			if(Jogabilidade.OFFLINE != null)
				pontosX2P += 30;
			if(Jogabilidade.MULTPLAYER != null)
				pontosX2P += 10;
		}
	}

	@Override
	public void punir(String nomeJogo, int scoreObtido, boolean zerou) {
		if(jogosUsuario.contains(nomeJogo)){
			if(Jogabilidade.ONLINE != null)
				pontosX2P -= 10;
			if(Jogabilidade.COMPETITIVO != null)
				pontosX2P -= 20;
			if(Jogabilidade.COOPERATIVO != null)
				pontosX2P -= 50;
		}
	}

}
