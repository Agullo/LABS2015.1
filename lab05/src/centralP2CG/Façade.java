package centralP2CG;

import java.util.ResourceBundle.Control;
import java.util.Scanner;

public class Façade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Loja loja = new Loja();
		int opcao;

		do {
			loja.menuLoja();

			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				loja.criarUsuario(nome, login, saldo, tipo);
				break;

			case 2:
				loja.criarJogo(nomeDoJogo, preco, tipoDeJogo, listaJogabilidade);
				break;

			case 3:
				loja.vendeJogo(usuario, jogo);
				break;

			case 4:
				loja.adicionaDinheiro(usuario, dinheiro);
				break;
			}

		} while (opcao != 5);

	}
}
