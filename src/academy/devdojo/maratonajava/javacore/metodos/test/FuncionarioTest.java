package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Goku");
        funcionario.setIdade(89);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
