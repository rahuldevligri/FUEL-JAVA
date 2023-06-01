public class Q7
{
    public static void main(String args[])
    {
        for(int i=1,num=5;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
