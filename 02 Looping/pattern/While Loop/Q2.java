//armstrong number or not
public class Q2 {
    public static void main(String args[])
    {
        int num=153,r=0,cnt=0,add=0;
        int d=num;
        while(d>0)
        {
            r=d%10;
            d/=10;
            cnt++;
        }
         d=num;
        int c=0;
        while(d>0)
        {
            r=d%10;
            d/=10;
            System.out.print(c +" before ");
            c=(int)Math.pow(cnt,r);
            add+=c;
            System.out.print("after "+c + " ");
        }
//        if(add==num)
//            System.out.println("It's an armstrong number");
//        else
//            System.out.println("It's not an armstrong number");
    }
}
