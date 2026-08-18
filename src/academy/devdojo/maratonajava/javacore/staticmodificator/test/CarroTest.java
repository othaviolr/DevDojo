package academy.devdojo.maratonajava.javacore.staticmodificator.test;

import academy.devdojo.maratonajava.javacore.staticmodificator.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(310);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 300);
        Carro c3 = new Carro("Audi", 270);

        c1.imprimeCarro();
        c2.imprimeCarro();
        c3.imprimeCarro();
    }
}
