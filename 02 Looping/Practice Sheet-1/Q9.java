/*
1        
3  2
6  5 4
10 9 8 7
 */
public class Q9 {
    public static void main(String args[]){
        for(int i=1,cnt=0;i<=4;i++){
            int temp=(cnt+=i);
            for(int j=1;j<=i;j++)
                System.out.print(temp--);
            System.out.println();
        }
    }
}
