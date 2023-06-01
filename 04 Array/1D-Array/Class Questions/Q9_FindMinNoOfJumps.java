/*
Write a program to find out min no of jumps required to reach end of Array.
 */
import java.util.Scanner; 
public class Q9_FindMinNoOfJumps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ///input array size
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        
        //array Creation
        int []a = new int[n];

        // array input
        for (int i=0;i<a.length;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //find min no of jumps...
        int cnt=0,p=0;
        for(int i=0;i<a.length;){
            cnt=a[i];
            i=cnt+i;
            System.out.println(i);
            p++;
        }
        System.out.println(p);
    }
}
