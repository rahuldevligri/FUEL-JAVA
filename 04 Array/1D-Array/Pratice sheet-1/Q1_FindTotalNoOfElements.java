/*
Write a program to find the total number of elements in an array?
*/
import java.util.Scanner;
public class Q1_FindTotalNoOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input array Size
        System.out.print("Enter Array Size: ");
        int size=sc.nextInt();

        //array creation
        int[] array = new int[size];

        //array input
        for(int i=0;i<array.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        //print total no of element in an array..
        System.out.println("Total no of Elements: "+array.length);

        //print total no of Index in an array..
        System.out.print("Total no of Index: "+(array.length-1));

    }
}
