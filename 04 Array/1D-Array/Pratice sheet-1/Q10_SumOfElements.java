/*
Write a program to find out the sum of elements of an array?
*/

public class Q10_SumOfElements {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        System.out.print("sum of elements of an array: "+sum);
    }   
}
