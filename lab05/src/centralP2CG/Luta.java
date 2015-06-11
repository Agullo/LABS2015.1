package centralP2CG;

public class Luta extends Jogo {

	public Luta(String nome, double preco) throws Exception {
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
