
public class CheckSymmetricMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

        if (arr.length != arr[0].length)
            System.out.println("The matrix is not square, so it cannot be symmetric.");
        else {
            boolean isSymmetric = true;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    if (arr[i][j] != arr[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                if (!isSymmetric)
                    break;
            }
            if (isSymmetric)
                System.out.println("It's symmetric");
            else
                System.out.println("It's not symmetric");
        }
    }
}