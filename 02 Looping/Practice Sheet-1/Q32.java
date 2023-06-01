/*
0 
0 1 
0 2 4 
0 3 6 9 
0 4 8 12 16 
0 5 10 15 20 25 
0 6 12 18 24 30 36
*/
public class Q32 {
    public static void main(String[] args){
        for(int i=1,cnt=0;i<=7;i++,cnt++){
            for(int j=1,p=0;j<=i;j++,p+=cnt)
                System.out.print(p+" ");
            System.out.println();
        }
    }
}
