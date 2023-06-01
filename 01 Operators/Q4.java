public class Q4 {
    public static void main(String [] args)
    {
        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if (( ++x > 2 ) && (++y > 2))
            {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }
}
/*
   Output
 x | y | z
 0 | 0 | 0
 1 | 0 | 1
 2 | 0 | 2
 3 | 1 | 3
 4 | 2 | 4
 5 | 3 | 5
 6 | 3 | 5
 */