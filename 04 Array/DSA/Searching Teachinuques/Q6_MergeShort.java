public class Q6_MergeShort {
    public static void main(String[] args){
        // int[] a = {3,1,2,16,5,0,11,7,9};
        int[] a={3,2,5,1,4};
        int lb=0;
        int ub=a.length-1;
        sort(a,lb,ub);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a, int lb, int ub){
        if(lb<ub){
            int mid = (lb + ub) / 2;
            sort(a, lb, mid);
            sort(a, mid + 1, ub);
            mergesort(a, lb,  ub, mid);
        }
    }
   
    public static void mergesort(int[] a, int lb,int ub, int mid){
        int[] b = new int[ub+1];
        int i = lb;
        int j = mid+1;
        int k = lb;
        while(i<=mid && j<=ub){
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
                k++;
            }
            else{
                b[k]=a[j];
                i++;
                k++;
            }
        }
        if(i <= mid){
            while(i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        } else{
            while(j<=ub){
                b[k] = a[j];
                j++;
                k++;
            }
        }
        for(int p=lb;p<=ub;p++){
            b[p]=a[p];
        }
    }  
}
