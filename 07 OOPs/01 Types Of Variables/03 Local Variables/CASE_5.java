public class CASE_5 {
    public static void main(String[] args){
        final int a;// initialization is compalsary at the time of final variable declaration.
        System.out.println("Main Method");
        int b=20;
        System.out.println(b);
        a=30; // <- reinitialization of final variable isn't allow.
        System.out.println(a);// error
    }    
}
