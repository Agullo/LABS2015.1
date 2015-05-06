package sp2fy;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestAlbum {
	
		

	
	@Test
	public void testAlbum() {
		try {
			Album FormsOfFear = new Album("Sia", "1000 Forms of Fear", 2014);
			Album Smoke = new Album("Imagine Dragons", "Smoke + Mirrors", 2014);
			Album TheExperience = new Album("Justin Timberlake",
					"The 20/20 Experience", 2013);

			assertEquals("Sia", FormsOfFear.getArtista());
			Assert.assertEquals("1000 Forms of Fear", FormsOfFear.getTitulo());
			Assert.assertEquals(2014, FormsOfFear.getAnoDeLancamento());

			Assert.assertEquals("Imagine Dragons", Smoke.getArtista());
			Assert.assertEquals("Smoke + Mirrors", Smoke.getTitulo());
			Assert.assertEquals(2014, Smoke.getAnoDeLancamento());

			Assert.assertEquals("Justin Timberlake", TheExperience.getArtista());
			Assert.assertEquals("The 20/20 Experience",
					TheExperience.getTitulo());
			Assert.assertEquals(2013, TheExperience.getAnoDeLancamento());

			Album FormsOfFearRemix = new Album("Sia", "1000 Forms of Fear",
					2014);
			Assert.assertEquals(FormsOfFear, FormsOfFearRemix);
			Assert.assertFalse(FormsOfFear.equals(TheExperience));

		} catch (Exception e) {
			Assert.fail();// nao deveria ter lancado nenhuma Exception nesse
							// teste.
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAlbumInvalido() {
		try {
			Album artistaInvalido = new Album("", "1000 Forms of Fear", 2014);
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			Assert.assertEquals("Artista não pode ser nulo ou vazio. ",
					e.getMessage());
		}

		try {
			Album tituloInvalida = new Album("Imagine Dragons", "", 2014);
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			Assert.assertEquals("Titulo do Album nao pode ser vazio. ",
					e.getMessage());
		}

		try {
			Album anoInvalido = new Album("Justin Timberlake",
					"The 20/20 Experience", -400);
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			Assert.assertEquals(
					"Ano de Lancamento do Album nao pode ser negativo. ",
					e.getMessage());
		}

	}

	
	@Test
	public void testTempoTotal() throws Exception{
		Album FormsOfFear = new Album("Sia", "1000 Forms of Fear", 2014);

		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		FormsOfFear.adiconaMusica(cellophane);
		Assert.assertEquals(4, FormsOfFear.getTempoTotal());

		FormsOfFear.adiconaMusica(elasticHeart);
		FormsOfFear.adiconaMusica(chandelier);

		Assert.assertEquals(10, FormsOfFear.getTempoTotal());

	}


	@Test
	public void testOrdemDasMusicas() throws Exception {
		Album FormsOfFear = new Album("Sia", "1000 Forms of Fear", 2014);

		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		FormsOfFear.adiconaMusica(cellophane);
		Assert.assertEquals(1, FormsOfFear.pegaIndexMusica("Cellophane"));
		
		FormsOfFear.adiconaMusica(elasticHeart);
		FormsOfFear.adiconaMusica(chandelier);
		
		Assert.assertEquals(3, FormsOfFear.pegaIndexMusica("Chandelier"));

	}
	
	@Test
	public void testRemoveMusica() throws Exception{
		Album FormsOfFear = new Album("Sia", "1000 Forms of Fear", 2014);

		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		FormsOfFear.adiconaMusica(cellophane);
		FormsOfFear.adiconaMusica(elasticHeart);
		Assert.assertEquals(1, FormsOfFear.pegaIndexMusica("Cellophane"));
		
		FormsOfFear.adiconaMusica(chandelier);
		FormsOfFear.removeMusica(cellophane);
		assertEquals(1, FormsOfFear.pegaIndexMusica("Elastic Heart"));
		
		
		
	}

}
