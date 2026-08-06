package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoCompra = idade >= 18;

        // Else If
        if(isAutorizadoCompra)
            System.out.println("Autorizado");
        else
            System.out.println("Não autorizado");
        // if(!isAutorizadoCompra) System.out.println("Não autorizado");

        String categoria;

        if(idade < 15)
            categoria = "Categoria infantil";
        else if (idade >= 15 && idade < 18)
            categoria = "Categoria juvenil";
        else
            categoria = "Categoria profissional";

        System.out.println(categoria);

        // Ternário
        double salario = 6000;
        String mensagemDoar = "Irei doar 500 reais";
        String mensagemNaoDoar = "Não irei doar 500 reais";
        //String resultado;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        /*
        if(salario > 5000)
            resultado = mensagemDoar;
        else resultado = mensagemNaoDoar;
        System.out.println(resultado); */

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712)
            valorImposto = salarioAnual * primeiraFaixa;
        else if (salarioAnual >= 34712 && salarioAnual <= 68507)
            valorImposto = salarioAnual * segundaFaixa;
        else valorImposto = salarioAnual * terceiraFaixa;
        System.out.println(valorImposto);
    }
}
