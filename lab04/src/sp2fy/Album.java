package sp2fy;

import java.util.ArrayList;

public class Album implements Comparable<Album>, Comparator<Album> {

	private String artista;
	private String titulo;
	private int anoDeLancamento;

	private ArrayList<Musica> listaDeMusicas;

	public Album(String artista, String titulo, int anoDeLancamento)
			throws Exception {
		this.artista = artista;
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;
		listaDeMusicas = new ArrayList<Musica>();

		verificaErroArtista(artista);
		verificaErroAnoDeLancamento(anoDeLancamento);
		verificaErroTitulo(titulo);

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

	public Musica getMusica(int faixa) {
		for (int i = 0; i < listaDeMusicas.size(); i++) {
			if (listaDeMusicas.get(i).equals(faixa)) {
				return listaDeMusicas.get(i);
			}
		}
		return null;
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (int i = 0; i < listaDeMusicas.size(); i++) {
			tempoTotal += (listaDeMusicas.get(i).getDuracao());
		}
		return tempoTotal;
	}

	public void adiconaMusica(Musica musica) throws Exception {
		verificaErroMusica(musica);

		listaDeMusicas.add(musica);
	}

	public int pegaIndexMusica(String nome) throws Exception {

		verificaErroNome(nome);

		for (int i = 0; i < listaDeMusicas.size(); i++) {
			if ((listaDeMusicas.get(i).getNome().equals(nome)))
				return (i + 1);
		}
		return 0;
	}

	public void removeMusica(Musica musica) throws Exception {
		verificaErroMusica(musica);

		listaDeMusicas.remove(musica);
	}

	@Override
	public String toString() {
		return artista;
	}

	@Override
	public int compareTo(Album outroAlbum) {
		if (this.anoDeLancamento < outroAlbum.anoDeLancamento) {
			return -1;
		}
		if (this.anoDeLancamento > outroAlbum.anoDeLancamento) {
			return 1;
		}
		return 0;
	}

	public int compareArtista(Album album, Album outroAlbum) {
		return album.getArtista().compareTo(outroAlbum.getArtista());
	}

	@Override
	public int compare(Album o1, Album o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void verificaErroTitulo(String titulo) throws Exception {
		if (titulo == null || titulo.equals(""))
			throw new Exception("Titulo do Album nao pode ser vazio. ");
	}

	private void verificaErroAnoDeLancamento(int anoDeLancamento)
			throws Exception {
		if (anoDeLancamento <= 0)
			throw new Exception(
					"Ano de Lancamento do Album nao pode ser negativo. ");
	}

	private void verificaErroArtista(String artista) throws Exception {
		if (artista == null || artista.equals(""))
			throw new Exception("Artista não pode ser nulo ou vazio. ");
	}

	private void verificaErroMusica(Musica musica) throws Exception {
		if (musica == null) {
			throw new Exception("A Musica nao pode ser nulo. ");
		}
	}

	private void verificaErroNome(String nome) throws Exception {
		if (nome == null || nome.equals(""))
			throw new Exception("O Nome não pode ser nulo ou vazio. ");
	}

}
