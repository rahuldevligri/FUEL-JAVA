/*
 1 2 3 4
 1     4
 1     4
 1 2 3 4
 */
public class Q6_1
{
    public static void main(String args[]) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4 ;j++)
            {
                if(i==1||j==1||i==4||j==4)
                  System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
