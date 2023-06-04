package P1;
class A{
    int a =10;
    private int b=20;
    public int c = 30;
    protected int d=40;
}
public class B{
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.a);
       // System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}