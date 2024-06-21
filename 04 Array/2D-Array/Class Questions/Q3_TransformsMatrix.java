//transforms matrix
/*
        coloum
 *  row 1 2 3
 *  row 4 5 6
 */
public class Q3_TransformsMatrix {
    public static void main(String[] args) {

        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int row = a[0].length;// 3
        int coloum = a.length;// 3
        int[][] b = new int[row][coloum];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                b[j][i] = a[i][j];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
    }
}
