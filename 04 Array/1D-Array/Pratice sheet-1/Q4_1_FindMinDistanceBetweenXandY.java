/*
Given an array of n elements, and two integers say x and y, present in the
array, find out the minimum distance between x and y in the array, that is the
number of elements between x and y, including y. If the elements are not
present print infinite value.
Example:
ArrayOne = [1, 2, 3, 4, 5, 6]
x = 2
y = 5
Output
3
*/
import java.util.Scanner;
public class Q4_1_FindMinDistanceBetweenXandY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //input array size...
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        
        //array Creation...
        int []a = new int[size];

        // array input...
        for (int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("***Find Min Distance between 2 Elements***");
        
        //input value of x 
        System.out.print("Enter X value: ");
        int x=sc.nextInt();
        
        
        //input value of y
        System.out.print("Enter Y value: ");
        int y=sc.nextInt();
        
        int count_x=1;
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                count_x=i;
                break;
            }

        }

        int count_y=1;
        for(int i=0;i<a.length;i++){
            if(y==a[i]){
                count_y=i;
                break;
            }
        }
        System.out.print(count_y-count_x);
    }
}
