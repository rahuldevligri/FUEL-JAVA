//Calculator
import java.util.Scanner;
public class Q7 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int b,a,c;
        while(true){
        System.out.println("***Calculataor****");
        System.out.println("Enter the Operation you want to perform or press -1 to exit: ");
        System.out.println("1: + ");
        System.out.println("2: - ");
        System.out.println("3: * ");
        System.out.println("4 : / ");
        System.out.println("5 : % ");
        c=sc.nextInt();
        if(c==-1)
        {
            break;
        }
        System.out.println("Enter 1st Number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        b=sc.nextInt(); 
        switch(c){
            case 1:
            System.out.println(a+b);
            break;

            case 2:
            System.out.println(a-b);
            break;

            case 3:
            System.out.println(a*b);
            break;

            case 4:
            System.out.println(a/b);
            break;

            case 5:
            System.out.println(a%b);
            break;

            default:
            System.out.println("Invalid Input");
        }
    }
}
    
}
