/*
Write a program to find the largest element in an array?
*/
import java.util.Scanner;
public class Q2_FindLargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        //input array size
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();

        //create an array
        int[] a=new int[size];

        //input an array
        for(int i=0;i<a.length;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //find Largest element in array
        int largest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>largest)
                largest=a[i];
        }
        //print largest element in an array
        System.out.println("Largest element is: "+largest);
    }   
}
