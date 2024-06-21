/*
Write a program to check whether a given matrix is symmetric Matrix or not?
 */
public class Q4_1_CheckSymmetricMatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
        boolean flag = false;
        int i, j;
        if (a.length == a[0].length) {
            for (i = 0; i < a.length; i++) {
                flag = false;
                for (j = 0; j < a[i].length; j++) {
                    if (a[i] != a[j]) {
                        if (a[i][j] == a[j][i]) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == false) {
                    break;
                }
            }
            if (flag == true) {
                System.out.print("its simatrix matrix---");
            } else {
                System.out.print("its not..");
            }
        }
    }
}
