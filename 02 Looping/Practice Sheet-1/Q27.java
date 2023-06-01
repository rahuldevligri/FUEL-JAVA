/*
1 
2 1
4 2 1
8 4 2 1
16 8 4 2 1
32 16 8 4 2 1
64 32 16 8 4 2 1
128 64 32 16 8 4 2 1
 */
public class Q27 {
    public static void main(String args[]){
        for(int i=1,cnt=1;i<=8;i++,cnt*=2){
            //int p=cnt;
            for(int j=1,p=cnt;j<=i;j++,p/=2){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
