package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

public class UsuarioNoob extends Usuario {

	public UsuarioNoob(String nome, String login, double saldo) throws IllegalAccessException {
		super(nome, login, saldo);
	}
	
	@Override
	public void comprarJogo(Jogo novoJogo) {
		double valorDesconto = ((10/100) * novoJogo.getPreco());
		double novoJogoDescontoNoob = (novoJogo.getPreco() - valorDesconto);
		if(saldo >= novoJogoDescontoNoob){
			jogosUsuario.add(novoJogo);
		}
	}
	

}
