package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.idade = 31;
        professor.nome = "Noah Sebastian";
        professor.sexo = 'H';

        System.out.println(professor.nome + " "+professor.idade + " "+ professor.sexo);
    }
}
