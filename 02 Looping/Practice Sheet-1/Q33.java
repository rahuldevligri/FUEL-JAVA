/*
5432112345
5432  2345
543    345
54      45
5        5
 */
public class Q33 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(j>=i)
                    System.out.print(j);
                else
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                if(j>=i)
                    System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
