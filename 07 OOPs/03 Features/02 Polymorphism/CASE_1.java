class A{
    public void M1(int a){
        System.out.println("int- arg Method");
    }
    public void M1(float f){
        System.out.println("float-arg Method");
    }
}
public class CASE_1 {
    public static void main(String[] args){
        A a=new A();
        a.M1();
        /*error: no suitable method found for M1(no arguments)
        a.M1();
         ^
    method A.M1(int) is not applicable
      (actual and formal argument lists differ in length)
    method A.M1(float) is not applicable
      (actual and formal argument lists differ in length) */
        
      
      a.M1(10);//int- arg Method
    }
}
