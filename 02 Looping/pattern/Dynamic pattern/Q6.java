public class Q6 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1,p=1;j<=i;j++)
            {
                if(j%2!=0){
                    System.out.print(p);
                    p++;
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
