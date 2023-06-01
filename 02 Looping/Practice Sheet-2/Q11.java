/*
1 2 3 4 5 
2       4
3       3
4       2
5 4 3 2 1
*/
public class Q11 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1)
                    System.out.print(j+" ");
                else if(j==1)    
                    System.out.print(i+" ");
                else if(i==n)    
                    System.out.print((i+1-j)+" ");
                else if(j==n)    
                    System.out.print((j+1-i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }    
}
