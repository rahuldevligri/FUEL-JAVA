/*
* * * * * 
 * * * * 
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
 */
public class Q21 {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    
}
