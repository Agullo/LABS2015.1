package centralP2CG;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

import java.util.ArrayList;

public class Loja {

	private ArrayList<Usuario> listaDeUsuarios;

	public void criarUsuario(String nome, String login, double saldo,
			String tipo) throws IllegalAccessException {
		if(tipo.equals("UsuarioVeterano")){
			Usuario nome1 = new UsuarioVeterano(nome, login, saldo);
		}

	}

	public void criarJogo(String nome, double preco) {

	}

	public void vendeJogo(Usuario usuario, Jogo jogo) {

	}

	public void adicionaDinheiro(Usuario usuario, double saldo) {

	}

}
