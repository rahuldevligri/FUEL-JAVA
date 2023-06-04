//String and StringBuffer class are child of Object class...
/*
error: reference to M1 is ambiguous
        a.M1(null);//String-arg Method
         ^
  both method M1(String) in A and method M1(StringBuffer) in A match
 */
class A{
    public void M1(String s){ 
        System.out.println("String-arg Method");
    }
    public void M1(StringBuffer sb){ 
        System.out.println("StringBuffer-arg Method");
    }
}
public class CASE_5 {
    public static void main(String[] args){
        A a=new A();
        a.M1(null);//String-arg Method
    }
}
