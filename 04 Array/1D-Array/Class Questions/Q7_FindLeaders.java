/*
Write a program to find out leaders in an array.
 */
import java.util.Scanner;
public class Q7_FindLeaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input array size
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        
        //array Creation
        int []a = new int[size];

        //array input
        for (int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }

        //Find Leader...
        for(int i=0;i<a.length;i++){
            boolean leader=true;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true)
                    System.out.print(a[i]+"\t");
        }
    }
}
