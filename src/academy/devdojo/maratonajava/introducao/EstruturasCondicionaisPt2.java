package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisPt2 {
    public static void main(String[] args) {
        // switch
        byte dia = 5;
        switch (dia){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda");
            break;
            case 3: System.out.println("Terça");
            break;
            case 4: System.out.println("Quarta");
            break;
            case 5: System.out.println("Quinta");
            break;
            case 6: System.out.println("Sexta");
            break;
            case 7: System.out.println("Sábado");
            break;
        }

        char sexo = 'H';
        switch (sexo){
            case 'H':
                System.out.println("Homem");
                break;
            case 'M':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        byte day = 1;
        switch (day){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
