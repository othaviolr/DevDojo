package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Goku";
        funcionario.idade = 89;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
