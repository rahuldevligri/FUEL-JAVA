//write a program to perform matrix addition?
public class Q2_1_AdditionOfMatrix {
    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] sum = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                sum[i][j] = a[i][j] + b[i][j];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++)
                System.out.print(sum[i][j] + "\t");
            System.out.println();
        }
    }
}
