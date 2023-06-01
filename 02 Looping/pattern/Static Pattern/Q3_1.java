/*
1
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
 */
public class Q3_1
{
    public static void main(String args[]) {
        for(int i=1,p=0;i<=5;i++,p++)
        {
            for(int j=1;j<=i+p;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
