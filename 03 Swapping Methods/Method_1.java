public class Method_1{
        public static void temp(int a,int b){
        int t=a; 
        //a=b; 
        //b=t;
        System.out.println("After swap");
        System.out.println("a = "+(a=b));
        System.out.println("b = "+(b=t));
        }
    public static void main(String args[]){
        int a=5,b=7;
        System.out.println("Before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        temp(a,b);
    }
}