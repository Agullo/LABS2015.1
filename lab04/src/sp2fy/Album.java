package sp2fy;

import java.util.ArrayList;

public class Album {

	private String artista;
	private String titulo;
	private int anoDeLancamento;
	
	private ArrayList<Musica> listaDeMusicas;

	public Album(String artista, String titulo, int anoDeLancamento)
			throws Exception {
		this.artista = artista;
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;

		if (artista == null || artista.equals(""))
			throw new Exception("Artista não pode ser nulo ou vazio. ");
		if (anoDeLancamento <= 0)
			throw new Exception("Ano de Lancamento do Album nao pode ser negativo. ");
		if (titulo == null || titulo.equals(""))
			throw new Exception("Titulo do Album nao pode ser vazio. ");

	}

	public String getArtista() {
		return artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public boolean equals(Object outro) {
		if (!(outro instanceof Album))
			return false;

		Album outroAlbum = (Album) outro;
		if (this.artista.equals(outroAlbum.getArtista())) {
			return true;
		}
		if (this.titulo.equals(outroAlbum.getTitulo())) {
			return true;
		}

		return false;
	}

	public int getTempoTotal(){
		int tempoTotal = 0;
		for (int i = 0; i < listaDeMusicas.size(); i++) {
			tempoTotal += (listaDeMusicas.get(i).getDuracao()); 			
		}
		return tempoTotal;
	}
}
