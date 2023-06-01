/*
****************
*******__*******
******____******
*****______*****
****________****
***__________***
**____________**
*______________*
*/
public class Q22 {
    public static void main(String args[]){
        int n=8;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n*2;j++){
                if(j<=i||j>=(1+n)*2-(i+1))
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();    
        }
    }
}
