package centralP2CG;

import java.util.ArrayList;
import java.util.Collections;

public class CatalogoJogos implements TiposOrdenacaoJogos, Comparable<CatalogoJogos>{

	public ArrayList<Jogo> catalogoDeJogos;

	public CatalogoJogos() {

	}

	public void adicionaJogo(Jogo novoJogo) {
		catalogoDeJogos.add(novoJogo);
	}

	public String jogoComMaiorScore() {
		String maiorScore = null;
		for (int i = 0; i < catalogoDeJogos.size() - 1; i++) {
			if (catalogoDeJogos.get(i).getPontuacaoMaxima() > catalogoDeJogos
					.get(i + 1).getPontuacaoMaxima()) {
				maiorScore = catalogoDeJogos.get(i).getNome();
			}
		}
		return maiorScore;
	}

	public String jogoJogadoMaisVezes() {
		String maisVezes = null;
		for (int i = 0; i < catalogoDeJogos.size() - 1; i++) {
			if (catalogoDeJogos.get(i).getQntDeVezesJogadas() > catalogoDeJogos
					.get(i + 1).getQntDeVezesJogadas()) {
				maisVezes = catalogoDeJogos.get(i).getNome();
			}
		}
		return maisVezes;
	}

	public String jogoZeradoMaisVezes() {
		String maisZerado = null;
		for (int i = 0; i < catalogoDeJogos.size() - 1; i++) {
			if (catalogoDeJogos.get(i).getQntDeVezesZerado() > catalogoDeJogos
					.get(i + 1).getQntDeVezesZerado()) {
				maisZerado = catalogoDeJogos.get(i).getNome();
			}

		}
		return maisZerado;
	}
	
	public String jogoComEstaJogabilidade(Jogabilidade jogabilidade){
		String jogosJogabilidade = null;
		for (int i = 0; i < catalogoDeJogos.size(); i++) {
			if(catalogoDeJogos.get(i).getJogabilidade().contains(jogabilidade) == true){
				jogosJogabilidade += catalogoDeJogos.get(i).getNome();
			}			
		}
		return jogosJogabilidade;
		
	}

	@Override
	public void ordenaPorVicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenaPorDesempenho() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenaPorExperiencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenaPorDefault() {
		 Collections.sort(catalogoDeJogos);
	}

	@Override
	public int compareTo(CatalogoJogos outroCatalogo) {
		// TODO Auto-generated method stub
		return 0;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
