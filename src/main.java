public class main {
    public static void main(String[] args) {

        System.out.println("Введите два числа ");
        matrix mat = new matrix(matrix.num.nextInt(), matrix.num.nextInt());
        System.out.println();

        System.out.println("Сложение ");
        mat.slozhenie(mat.mat1,mat.mat2);
        System.out.println();

        System.out.println("чиcло");
        mat.umnozhenie(mat.mat1, matrix.num.nextInt());
        System.out.println();
        mat.umnozhenie(mat.mat2, mat.c);
        System.out.println();

        System.out.println("Умножение матриц");
        mat.umnozhenieMat(mat.mat1,mat.mat2);
        System.out.println();

    }


}

