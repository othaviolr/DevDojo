package academy.devdojo.maratonajava.introducao;

public class ArraysPt2 {
    public static void main(String[] args) {
        // meses
        // dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 25;
        dias[0][2] = 12;

        dias[1][0] = 17;
        dias[1][1] = 8;
        dias[1][2] = 30;

        for (int i = 0; i < dias.length; i++)
            for (int j = 0; j < dias[i].length; j++)
                System.out.println(dias[i][j]);

        for(int[] arrBase : dias)
            for (int num: arrBase)
                System.out.println(num);
    }
}
