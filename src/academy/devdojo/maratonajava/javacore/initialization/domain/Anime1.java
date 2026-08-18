package academy.devdojo.maratonajava.javacore.initialization.domain;

public class Anime1 {
    String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime1(String nome){
        this.nome = nome;
    }

    public Anime1() {
        for (int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
    }
}
