/*
Write a program to insert element in 1D array and display them.
 */
import java.util.Scanner;

 public class Q1_insert_print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        
        //array size input
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();

        //array creating 
        int[] a=new int[size];

        //array input
        for(int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //print input array
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
    
}
