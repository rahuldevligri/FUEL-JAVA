class A {
    public void M1(float f){
        System.out.println("Float-arg Method");
    } 
    public void M1(double d){
        System.out.println("Double-arg Method");
    }   
}
public class CASE_2{
    public static void main(String[] args){
        A a = new A();
        a.M1(10);//Float-arg Method
        //M1(int) <- not found upcasting....
        //M1(long) <- not found upcasting...
        //M1(float) <- found...invoke M1(float) method and generate output....
    }
}
