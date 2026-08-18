package academy.devdojo.maratonajava.javacore.construtores.test;

import academy.devdojo.maratonajava.javacore.construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        academy.devdojo.maratonajava.javacore.construtores.domain.Anime anime = new Anime("Tokyo Ghoul", "tv", 12, "Ficção", "studio x");
        anime.imprimee();
    }
}
