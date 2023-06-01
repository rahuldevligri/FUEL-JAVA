/*
Write a program to search an element from an array?
 */
public class Q9_SearchAnElement {
    public static void main(String[] args){
        int[] a={-1,-3,2,8,6};
        int search=8;
        boolean flag=false;
        int i;
        for(i=0;i<a.length;i++){    
            if(search==a[i]){
                    flag=true;
                    break;
                }
        }
        if(flag==true)
            System.out.print("Search Element "+search+" found at: "+(i+1));
        else
            System.out.print("Element not fount");
    }
}
