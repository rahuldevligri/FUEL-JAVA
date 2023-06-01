/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
 */
public class Q3 
{
    public static void main(String args[])
    {
        for(int i=1,num=5;i<=num;i++)
        {
            for(int j=1;j<=(num+1)-i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
