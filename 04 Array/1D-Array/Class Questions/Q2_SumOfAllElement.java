/*
Write a program to find out sum of all elements of an array.
*/
import java.util.Scanner;

public class Q2_SumOfAllElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Array Size input
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();

        //create an array
        int[] a = new int[size];
        
        //input an array and sum of array element
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum of all elements: "+sum);

    }    
}
