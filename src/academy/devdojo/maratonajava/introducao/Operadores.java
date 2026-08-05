package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {

        //  + - *
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;

        System.out.println(result);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);

        // && -> (AND) || -> (or) ! (negation)
        int idade = 23;
        float salario = 3000f;
        boolean isDentroDaLeiMaior = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenor = idade < 30 && salario >= 4612;

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 1000;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        System.out.println(contador);
    }
}
