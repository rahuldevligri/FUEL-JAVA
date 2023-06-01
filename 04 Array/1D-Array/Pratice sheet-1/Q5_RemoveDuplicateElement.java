/*
Given a sorted array of integers, remove the duplicates of the elements from
the array.
Example:
Array = [1 2 2 3 3 4]
Output
Array = [1 2 3 4]
*/
import java.util.Scanner;
public class Q5_RemoveDuplicateElement {
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
        
        //remove duplicate elements
        for(int i=0;i<size;i++){
            boolean found=false;
            for(int j=i+1;j<size;j++){
                if(array[i]==array[j]){
                    found=true;
                    while(j<size-1){
                        array[j]= array[j+1];
                        j++;
                    }
                }
                if(found==true)
                    size--;
            }
        }

        //print array after remove duplicate element...
        for(int i=0;i<size;i++){
            System.out.print(" "+array[i]+"\t");
        }
    }
}
