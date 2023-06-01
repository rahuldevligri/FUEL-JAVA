/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
public class Q5_1 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1,p=i;j<=i;j++,p--)
            {
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
