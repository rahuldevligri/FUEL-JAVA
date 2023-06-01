public class Q3 {
    public static void main(String args[])
    {
        int a=2,b=1,c=4;
        while(a>=0)
        {
            if(a>b)
            {
                if(a>c){
                    System.out.print(a);
                    break;
                }
                else {
                    System.out.print(c);
                    break;
                }
            }
            else {
                if(c>b)
                {
                    System.out.print(b);
                    break;
                }
                else
                {
                    System.out.print(c);
                    break;
                }
            }
        }
    }
}
