public class Method_4 {
    public static void Xor_Operator(int a,int b){ 
        a^=b;                              //5= 0101        
        b=a^b;                             //7= 0111        
        //a^=b;                            //2= 0010 <-a=2 
        System.out.println("After swap");//7= 0111
        System.out.println("a = "+(a^=b)); //5= 0101 <-b=5
        System.out.println("b = "+b);      //2= 0010
        }                                  //7= 0111 <-a=7
    public static void main(String args[]){
        int a=5,b=7;
        System.out.println("Before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        Xor_Operator(a,b);
    }
}
