package academy.devdojo.maratonajava.introducao;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        // while, do while e for
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("dentro do do-while" + count);
            count++;
        }
        while(count < 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("For" +i);
        }

        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
