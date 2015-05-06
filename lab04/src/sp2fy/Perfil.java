package sp2fy;

import java.util.ArrayList;

public class Perfil {

	private String nome;
	private ArrayList<Album> albuns;
	private ArrayList<Album> albunsFavoritos;

	public Perfil(String nome) throws Exception {
		this.nome = nome;

		albuns = new ArrayList<Album>();
		albunsFavoritos = new ArrayList<Album>();

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
	
	public boolean adicionaAlbum(Album album){
		albuns.add(album);
		return true;
	}

	public boolean adicionaAosFavoritos(Album album){
		if(albuns.contains(album)){
			albunsFavoritos.add(album);
			return true;
		}
		return false;
	}
}
