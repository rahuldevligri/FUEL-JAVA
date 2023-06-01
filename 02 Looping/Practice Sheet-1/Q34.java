/*
1 * 2 * 3 * 4
1 * 2 * 3
1 * 2
1
 */
public class Q34 {
    public static void main(String[] args){
        for(int i=4;i>=1;i--){
            for(int j=1,p=1;j<=i*2-1;j++){
                if(j%2!=0)
                    System.out.print(p++ +" ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
