/*
Write a program to find out max element from an array.
*/
import java.util.Scanner;
public class Q3_FindMaxElement {
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

        //find max element in array
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Max element is: "+max);
    }
}
