package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Jogador;
import academy.devdojo.maratonajava.javacore.association.domain.Time;

public class JogadorTest1 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Santos");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
