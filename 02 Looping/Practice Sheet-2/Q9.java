
public class Q9 {
    public static void main(String[] args){
        int n=5;
        //upper loop
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j<=i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int k=1,cnt=i;k<=i;k++,cnt++)
                System.out.print(cnt+" ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            // for(int s=1;s<=n-i;s++){
            //     System.out.print(" ");
            // }
            for(int j=n,cnt=5;j>=i;j--){
                if(j<=i)
                System.out.print(cnt--+" ");
            }
            System.out.println();
        }
    }    
}
