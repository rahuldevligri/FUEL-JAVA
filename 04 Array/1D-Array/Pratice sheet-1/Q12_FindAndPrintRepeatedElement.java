/*
Given an array of integers, find and print the repeated elements and their
frequency of repetition.
Example:
Array: [1,2,3,4,5,5,3]
Output:
Element—–>Frequency
3—–>2
5—–>2
*/
public class Q12_FindAndPrintRepeatedElement {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,5,3};
        for(int i=0;i<a.length;i++){
            int jnt=1,knt=-1;
            for(int k=i;k>=0;k--){
                if(a[k]==a[i])
                    knt++;
            }
            if(knt==0){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                    jnt++;
                }
                if(jnt>1)
                    System.out.println(a[i]+"-->"+jnt);
            }
        }
    }
}
