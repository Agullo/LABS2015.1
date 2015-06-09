package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

public class UsuarioVeterano extends Usuario{

	public UsuarioVeterano(String nome, String login, double saldo) throws IllegalAccessException {
		super(nome, login, saldo);
	}
	
	@Override
	public void comprarJogo(Jogo novoJogo) {
		double valorDesconto = ((20/100) * novoJogo.getPreco());
		double novoJogoDescontoVeterano = (novoJogo.getPreco() - valorDesconto);
		if(saldo >= novoJogoDescontoVeterano){
			jogosUsuario.add(novoJogo);
		}
	}

}
