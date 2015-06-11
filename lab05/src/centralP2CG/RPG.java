package centralP2CG;

public class RPG extends Jogo {

	public RPG(String nome, double preco) throws Exception {
		super(nome, preco);
	}

	@Override
	public void jogar(int pontuacaoAtingida, boolean zerado) {
		if (pontuacaoAtingida > pontuacaoMaxima)
			pontuacaoMaxima = pontuacaoAtingida;
		if (zerado = true) {
			qntDeVezesZerado += 1;
		}
	}

}
