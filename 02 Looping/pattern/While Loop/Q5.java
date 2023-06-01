/*
Fibonacci series
-1 1 0 1 1 2 3 5
 a+b=c | | | | |
   a+b=c | | | |
     a+b=c | | |
       a+b=c | |
         a+b=c |
           a+b=c
 */
public class Q5 {
    public static void main(String args[])
    {
       int num=10,a=-1,b=1,c=0;
       while(num-->0)
       {
           c=a+b;
           System.out.println(c);
           a=b;
           b=c;
       }
    }
}
