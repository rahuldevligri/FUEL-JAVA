/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 */
public class Q24 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=i*2-1;j++){
                if(j==1||j==i*2-1)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=i*2-1;j++){
                if(j==1||j==i*2-1)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
