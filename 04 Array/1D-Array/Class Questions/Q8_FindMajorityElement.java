/*
Write a program to find out majority element in an array.
*/
import java.util.Scanner;
public class Q8_FindMajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ///input array size
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        
        //array Creation
        int []a = new int[n];

        // array input
        for (int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //find majority element
        for(int i=0;i<a.length;i++){
            int cnt=0;
            for(int j=i;j<a.length;j++){
                if(a[i]==a[j])
                    cnt++;
            }
            if(cnt>n/2)
                System.out.print("Majority Element is: "+a[i]); 
            }
    }
}
