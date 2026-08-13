package academy.devdojo.maratonajava.javacore.sobrecargas.test;

import academy.devdojo.maratonajava.javacore.sobrecargas.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Tokyo Ghoul", "tv", 12, "Ficção");
        anime.imprime();
    }
}
