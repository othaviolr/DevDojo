package academy.devdojo.maratonajava.introducao;

public class EstruturaRepeticaoPt2 {
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25)
                break;
            System.out.println(i);
        }

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000)
                break;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000)
                continue;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
