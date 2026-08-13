package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Sport";
        carro1.nome = "Subaru Impreza WRX";
        carro1.ano = 2005;

        carro2.modelo = "Sport";
        carro2.nome = "Mitsubishi Lancer Evolution IX";
        carro2.ano = 2005;

        carro1 = carro2;

        carro1.imprime();
        carro2.imprime();
    }
}
