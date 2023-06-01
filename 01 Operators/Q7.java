public class Q7 {
    public static void main(String args[])
    {
        int x = 0, y = 0 , z = 0 ;
            x = (++x + y-- ) * z++;
         // x = ( 1 + 0 ) = 1
        //  x = 1 * 0 = 0    
        System.out.print(x);// 0
        System.out.print(y);// -1
        System.out.print(z);// 1  
    }
    
}
