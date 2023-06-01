//sum of digit of N number.
public class Q1 {
    public static void main(String args[])
    {
        int num=12345,r=0,sum=0;
        while(num>0)
        {
            r=num%10;
            num/=10;
            sum+=r;
        }
        System.out.println(sum);
    }
}
