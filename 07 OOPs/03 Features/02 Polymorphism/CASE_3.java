    class A {
        public void M1(int a, float b){
            System.out.println("Float-arg Method");
        } 
        public void M1(float b, int a){
            System.out.println("Double-arg Method");
        }   
    }
    public class CASE_3{
        public static void main(String[] args){
            A a = new A();
            a.M1(10,20);//Error
/*
error: reference to M1 is ambiguous
            a.M1(10,20);//Float-arg Method
             ^
  both method M1(int,float) in A and method M1(float,int) in A match
1 error
 */
        }
    }
