import java.util.Random;
import java.util.Scanner;

public class matrix {
    public static Scanner num = new Scanner(System.in);
    int a;
    int b;
    int c;
    int[][] mat1;
    int [][] mat2;

    public matrix(int a, int b) {
        Random random = new Random();
        this.a = a;
        this.b = b;
        int[][] mat1 = new int[a][b];
        int[][] mat2 = new int[a][b];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = random.nextInt(25);
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = random.nextInt(10);
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        this.mat1 = mat1;
        this.mat2 = mat2;
    }

    public void slozhenie(int[][] mat1, int[][] mat2) {
        int[][] mat3 = new int[a][b];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void umnozhenie(int[][] mat1, int c) {
        this.c = c;
        int[][] multi = new int[a][b];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                multi[i][j] = mat1[i][j] * c;
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void umnozhenieMat(int[][] mat1, int[][] mat2) {
        int e;
        for (int i = 0; i< mat1.length; i++){
            for(int j = 0;j < mat1[i].length; j++){
                    e = mat1[i][j] * mat2[i][j];
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}