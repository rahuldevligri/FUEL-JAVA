 /*

 *       * * * * *
 *       *
 *       *
 * * * * * * * * *
         *       *
         *       *
 * * * * *       *

 */
public class Q2
{
    public static void main(String args[])
    {
        for(int i=0;i<=6;i++)
        {
            for(int j=0;j<=8;j++)
            {
                if( j==4  || i==3 || j==0 && i<=2 || j==8 && i>=3 || i==6 && j<=4 || i==0 && j>=5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

