/*
Write a program to find out the missing number in an array?
Example:
Array = [1, 2, 4, 5, 6]
Missing Number = 3
*/
public class Q13 {
   public static void main(String[] args){
    int[] a={1, 3, 5, 2};
    int r;
    for(int i=0;i<a.length-1;i++){
            int s=i+1;
            r=a[s]-a[i];
            if(r>1){
                for(int k=a[i]+1;k<a[s];k++){
                   boolean flag=false;
                    for(int l=0;l<a.length;l++){
                        System.out.print(a[l]);
                        if(k!=a[l]){
                            flag=true;
                        }
                   } 
                //    if(flag==true){
                //     System.out.println("Missing Number-> "+k);
                //    }
                }
            }
    }
   } 
}
 