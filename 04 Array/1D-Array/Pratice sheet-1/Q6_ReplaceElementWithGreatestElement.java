/*
Given an array of integers, replace each element of the array with the greatest
element present on the right side of the element, in the array. The rightmost
element or the last element should be replaced by 0.
Example:
Array = [-1, -3, 3, 2, 8 ,6]
Output: [8, 8, 8, 8, 6, 0].
*/
import java.util.Scanner;
public class Q6_ReplaceElementWithGreatestElement {
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

        /*replace each element with the greatest element present 
        on the right side of the element.*/
        for(int i=0;i<array.length-2;i++){
                int cnt=array[i+2];
            for(int j=i+1;j<array.length-1;j++){
                if(array[j]>cnt)
                    cnt=array[j];
        }
        array[i]=cnt;
            if(i==array.length-3){
                array[array.length-2]=array[array.length-1]; 
                array[array.length-1] = 0;
            }  
        }

        //print array after ...
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
/*
 for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length-1;j++){
                int cnt=j+1;
                if(array[cnt]>array[j]){
                    array[i]=array[cnt];
                }
                else{
                    array[i]=array[j];
                }
            }
            if(i==array.length-2){
                array[array.length-2]=array[array.length-1]; 
            }
            if(i == array.length-1){
                array[array.length-1] = 0;
            }
        }
 */