/*
1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class Q1 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            int s=i;
            for(int j=1,cnt=4;j<=i;j++,cnt--){
                System.out.print(s+" ");
                s+=cnt;
            }
            System.out.println();
        }
    }    
}
