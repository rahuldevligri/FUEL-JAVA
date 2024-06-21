
public class SearchAnElementIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int search = 3;
        boolean flg = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == search) {
                    flg = true;
                    System.out.println("True");
                    break;
                }
            if (flg == true)
                break;
        }
        if (!flg)
            System.out.println("False");
    }
}
