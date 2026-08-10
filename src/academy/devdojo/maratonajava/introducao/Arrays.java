package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades [0] = 21;
        idades [1] = 40;
        idades [2] = 100;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String[] nomes = new String[3];
        nomes [0] = "Oliver Sykes";
        nomes [1] = "Noah Sebastian";
        nomes [2] = "Synyster Gates";

        //System.out.println(nomes[0]);
        for (int i = 0; i < nomes.length; i++)
            System.out.println(nomes[i]);

        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        //1 jeito
        for (int i = 0; i < numeros.length; i++)
            System.out.println(numeros[i]);

        //2 jeito
        for (int num : numeros3)
            System.out.println(num);
    }
}
