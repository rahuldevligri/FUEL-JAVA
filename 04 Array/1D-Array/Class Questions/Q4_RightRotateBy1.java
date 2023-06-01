/*
Write a program to Right rotate the elements of an array by 1.
 */
import java.util.Scanner;
public class Q4_RightRotateBy1 {
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        
        //input array size
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        
        //array Creation
        int []a = new int[n];

        // array input
        for (int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //Right rotate by 1
        //put last element of array in temp..
        int temp=a[a.length-1];//50
        
        //shift by one
        for(int i=a.length-2;i>=0;i--)
            a[i+1]=a[i];
        
        //put temp value in starting element of array. 
        a[0]=temp; //50
        
        //output
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+"\t");
    }
}
