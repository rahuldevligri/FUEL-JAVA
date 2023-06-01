/*
Write a program to find out next greater element from an array.
*/
import java.util.Scanner;
public class Q3_NextGreaterElement  {
    public static void main(String args[]){
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

        //Find Next Greater Number
        for(int i=0;i<a.length;i++){
            boolean found=false;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    System.out.print(a[j]+"\t");
                    found=true;
                    break;
                }
            }
            if(found==false)
                System.out.print(-1+"\t");
        }
    }
    
}
