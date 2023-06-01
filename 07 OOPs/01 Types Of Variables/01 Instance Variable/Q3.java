//When load class A output nothing..
//When Load class B output = 10 and 20

class A {
    int a=10;
    int b=20;
public static void main(String[] args){
}
}
class B{
    public static void main(String[] args){
        A a=new A();
        System.out.println(a.a);
        System.out.println(a.b);
    }
}
