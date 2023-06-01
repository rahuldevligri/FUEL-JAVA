public class Q5_QuickShort 
{
    public static void main(String[] args)
    {
        int[] a = {3,2,5,1,4};
        //int[] a = {1,2,3,4,5};
        int lb=0,ub=a.length-1;
        sort(a,lb,ub);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a,int lb, int ub)
    {
        if(ub < lb)
        {
            int index=quicksort(a, lb, ub);
            sort(a,lb,index-1);
            sort(a,index+1,ub);
        }
    }

    public static int quicksort(int[] a,int lb,int ub)
    {
        int pivot=lb,start=lb,end=ub;
        while(start<end)
        {
            while(start < ub && a[start]<=a[pivot])
            {
                start++;
            }
            while(end > lb && a[end]>a[pivot])
            {
                end--;
            }
            if(start<end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp=a[pivot];
        a[pivot]=a[end];
        a[end]=temp;

        return end;
    }
}
