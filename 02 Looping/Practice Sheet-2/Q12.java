/*
        * 
      *   * 
    *       *
  *           *
* * * * * * * * *
 */
public class Q12 {
    public static void main(String[] args){
        for(int i=1,num=5;i<=num;i++){
            for(int s=1;s<=num-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j==1 || j==i*2-1||i==5)
                System.out.print("* ");
                else
                System.out.print("  "); 
            }
            System.out.println();
        }
    }    
}
