/*
Write a program to search an element from the array using linear search technique.
 */
import java.util.Scanner;
public class Q1_LinearSearch {
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

        //input Search element
        System.out.print("Enter Search Element: ");
        int search = sc.nextInt();

        //linear search....
        boolean found=false;
        for(int i=0;i<array.length;i++){
            if(search==array[i]){
                System.out.print("Element found at: "+(i+1));
                found = true;
                break;
            }
        }
        if(found==false){
            System.out.print("Element not found");
        }

    }
}
