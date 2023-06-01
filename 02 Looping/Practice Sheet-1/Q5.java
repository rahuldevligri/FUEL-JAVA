/*
1 
3 3
5 5 5
7 7 7 7
9 9 9 9 9
 */
public class Q5 {
    public static void main(String args[]){
        for(int i=1,num=5;i<=num;i++){
            for(int j=1;j<=i;j++)
                System.out.print((i*2-1)+" ");
            System.out.println();
        }
    }    
}
