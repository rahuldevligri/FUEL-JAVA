public class Method_3 {
    public static void multiplication_division(int a,int b){ 
        a*=b; 
        b=a/b;
        //a/=b;
        System.out.println("After swap");
        System.out.println("a = "+(a/=b));
        System.out.println("b = "+b);
        }
    public static void main(String args[]){
        int a=5,b=7;
        System.out.println("Before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        multiplication_division(a,b);
    }
}
