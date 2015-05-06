package sp2fy;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestPerfilSimples {

	@Test
	public void test() throws Exception {
		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		Album FormsOfFear = new Album("Sia", "1000 Forms of Fear", 2014);

		FormsOfFear.adiconaMusica(cellophane);
		FormsOfFear.adiconaMusica(elasticHeart);
		FormsOfFear.adiconaMusica(chandelier);

		Musica numb = new Musica("Numb", 4, "Rock");
		Musica inTheEnd = new Musica("In The End", 2, "Rock");
		Musica blackOut = new Musica("Black Out", 5, "Rock");

		Album Meteora = new Album("LP", "Meteora", 2010);

		Meteora.adiconaMusica(blackOut);
		Meteora.adiconaMusica(inTheEnd);
		Meteora.adiconaMusica(numb);

		Perfil Gullo = new Perfil("Gullo");

		Gullo.adicionaAlbum(FormsOfFear);
		Gullo.adicionaAlbum(Meteora);

		Gullo.adicionaAosFavoritos(Meteora);

		Assert.assertEquals(Meteora, Gullo.getAlbunsFavoritos());
		Assert.assertEquals(FormsOfFear, Gullo.getAlbuns());

	}

}
