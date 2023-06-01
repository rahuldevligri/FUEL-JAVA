/*
Given an array of integers, circularly rotate the elements of the array, by a
given value, say n.
Example:
int array[] = {1,2,3,4,5}
n = 3
output = {3,4,5,1,2} 
*/
import java.util.Scanner;
public class Q8_NRotateByN {
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
    
            //input Rotate value...
            System.out.print("Enter how time you want to rotate an element: ");
            int rotate=sc.nextInt();

        for(int i=a.length%rotate;i>=1;i--){
            int j=i-1,k=j+1,cnt=0;
            while(cnt<rotate){
            int temp=a[k];
            a[k]=a[j];
            a[j]=temp;
            cnt++;
            k++;
            j++;
        }
    }
            
            //output
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+"\t");
        }
}
