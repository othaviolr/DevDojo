package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Finalizado soma");
        calculadora.subtraiDoisNumeros();
        System.out.println("FInalizado subtração");

        calculadora.multiplicaDoisNumeros(5, 10);
        calculadora.divideDoisNumeros(50, 2);
    }
}
