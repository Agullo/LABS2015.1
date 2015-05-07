package sp2fy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Perfil {

	private String nome;
	private ArrayList<Album> albuns;
	private ArrayList<Album> albunsFavoritos;
	private Map<String, ArrayList<Musica>> playLists;

	public Perfil(String nome) throws Exception {
		this.nome = nome;

		albuns = new ArrayList<Album>();
		albunsFavoritos = new ArrayList<Album>();
		playLists = new HashMap<String, ArrayList<Musica>>();

		verificaErroNoNome(nome);

	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Album> getAlbuns() {
		return albuns;
	}

	public ArrayList<Album> getAlbunsFavoritos() {
		return albunsFavoritos;
	}

	public boolean adicionaAlbum(Album album) throws Exception {
		verificaErroAlbum(album);

		albuns.add(album);
		return true;
	}

	public boolean adicionaAosFavoritos(Album album) throws Exception {
		verificaErroAlbum(album);

		if (albuns.contains(album)) {
			albunsFavoritos.add(album);
			return true;
		}
		return false;
	}

	public void adicionaMusicaNaPlaylist(String nomePlaylist, Album nomeAlbum,
			int faixa) throws Exception {

		verificaErroNome(nomePlaylist);
		verificaErroFaixa(faixa);
		verificaErroAlbum(nomeAlbum);

		if (albuns.contains(nomeAlbum)) {
			if (playLists.containsKey(nomePlaylist)) {
				playLists.get(nomePlaylist).add(nomeAlbum.getMusica(faixa));
			} else {
				playLists.put(nome, new ArrayList<Musica>());
				playLists.get(nome).add(nomeAlbum.getMusica(faixa));
			}
		} else {
			throw new Exception("Álbum não pertence ao Perfil especificado. ");
		}

	}

	// public void adcionaPlaylist(String nomePlaylist, String nomeAlbum, int
	// faixa)throws Exception{
	// if(playlist.contains(nomePlaylist)){
	// return playlist;
	// }else{
	// nomePlaylist = new ArrayList<Musica>();
	// }
	//
	// if(playlist.contains(nomeAlbum)){
	//
	// }else {
	// throw new Exception("�lbum n�o pertence ao Perfil especificado");
	// }
	// }

	private void verificaErroNoNome(String nome) throws Exception {
		if (nome == null || nome.equals(""))
			throw new Exception("Titulo n�o pode ser nulo ou vazio. ");
	}

	private void verificaErroAlbum(Album nomeAlbum) throws Exception {
		if (nomeAlbum == null || nomeAlbum.equals(""))
			throw new Exception("Titulo do Album nao pode ser vazio ou nulo. ");
	}

	private void verificaErroFaixa(int faixa) throws Exception {
		if (faixa <= 0)
			throw new Exception(
					"O numero de faixas nao pode ser igual ou menor que zero");
	}

	private void verificaErroNome(String nomePlaylist) throws Exception {
		if (nomePlaylist == null || nomePlaylist.equals(""))
			throw new Exception("Nome da Playlist não pode ser nulo ou vazio. ");
	}
}
