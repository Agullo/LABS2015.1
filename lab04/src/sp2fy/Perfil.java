package sp2fy;

import java.util.ArrayList;

public class Perfil {

	private String nome;
	private ArrayList<Album> albuns;
	private ArrayList<Album> albunsFavoritos;
	private ArrayList<Musica> playlist;

	public Perfil(String nome) throws Exception {
		this.nome = nome;

		albuns = new ArrayList<Album>();
		albunsFavoritos = new ArrayList<Album>();
		playlist = new ArrayList<Musica>();

		if (nome == null || nome.equals(""))
			throw new Exception("Titulo não pode ser nulo ou vazio. ");

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

	public boolean adicionaAlbum(Album album) {
		albuns.add(album);
		return true;
	}

	public boolean adicionaAosFavoritos(Album album) {
		if (albuns.contains(album)) {
			albunsFavoritos.add(album);
			return true;
		}
		return false;
	}
	
//	public void adcionaPlaylist(String nomePlaylist, String nomeAlbum, int faixa)throws Exception{
//		if(playlist.contains(nomePlaylist)){
//			return playlist;
//		}else{
//			nomePlaylist = new ArrayList<Musica>();
//		}
//		
//		if(playlist.contains(nomeAlbum)){
//			
//		}else {
//			throw new Exception("Álbum não pertence ao Perfil especificado");
//		}
//	}
}
