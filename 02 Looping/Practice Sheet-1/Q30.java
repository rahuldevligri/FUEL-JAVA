/*
10 
10 8 
10 8 6 
10 8 6 4 
10 8 6 4 2 
 */
public class Q30 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            int p=10;
            for(int j=1;j<=i;j++,p-=2)
                System.out.print(p+" ");
            System.out.println();
        }
    }
}
