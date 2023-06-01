/*
Given an array of integers, find out the smallest positive integer missing from
the array.
Example:
Array = [-1, -3, 3, 2, 8 ,6]
Output: 1.
*/

public class Q11_FindSmallestPositiveInt {
    public static void main(String[] args){
        int[] a={-1, -3, 3, 2, 8 ,6};
        int temp=0;
        for(int i=1;i<a.length;i++){
            if(a[temp]<=0)
                temp++;
            if(a[i]>0 && a[temp]>a[i])
                a[temp]=a[i];
        }
        if(a[temp]<=0)     
            System.out.print("1");
        else 
        System.out.print(a[temp]-1);
    }   
}
