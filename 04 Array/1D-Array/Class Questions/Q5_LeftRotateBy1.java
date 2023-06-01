/*
Write a program to Left rotate the elements of an array by 1.
*/
import java.util.Scanner;
public class Q5_LeftRotateBy1 {
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        
        //input array size
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        
        //array Creation
        int []a = new int[size];

        // array input
        for (int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //Left rotate by 1
        //put array starting index value in temp.
        int temp=a[0];//now 10 in temp
        
        //shift by one
        for(int i=1;i<a.length;i++)
            a[i-1]=a[i];
        
        //put temp in array last element.
        a[a.length-1]=temp; //10
        
        //output
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
}
