/*
* * * * * * 
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Q17 {
    public static void main(String args[]){
        int n=6;
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
