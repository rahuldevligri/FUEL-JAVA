/*
0 1 2 3 4 5 
0 1 2 3 4 
0 1 2 3 
0 1 2 
0 1 
0 
 */
public class Q4 
{
    public static void main(String args[])
    {
        for(int i=0,num=6;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}
