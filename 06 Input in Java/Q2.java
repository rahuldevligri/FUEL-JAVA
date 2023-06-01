import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        sc.nextLine(); // enter charater ko terminate krne ke leyai taki Sting ke ander enter store na ho or enter isme store ho jaye...
        System.out.println("Enter your Full Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Reg. No: ");
        int reg=sc.nextInt();

        System.out.println(age);
        System.out.println(name);
        System.out.println(reg);
    }
    
}
