public class Method_2 {
    public static void addition_Subtraction(int a,int b){ 
        a+=b; 
        b=a-b;
        //a-=b;
        System.out.println("After swap");
        System.out.println("a = "+(a-=b));
        System.out.println("b = "+b);
        }
    public static void main(String args[]){
        int a=5,b=7;
        System.out.println("Before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        addition_Subtraction(a,b);
    }
}
