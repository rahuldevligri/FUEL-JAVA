//String class is the child of directly Object class....
//both are elligible...
//priority gives to child class....
//output = String-arg Method
class A{
    public void M1(Object o){ //parent
        System.out.println("Object-arg Method");
    }
    public void M1(String s){//child 
        System.out.println("String-arg Method");
    }
}
public class CASE_4 {
    public static void main(String[] args){
        A a=new A();
        a.M1(null);//String-arg Method
    }
}
