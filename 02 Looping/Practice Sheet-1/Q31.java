/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
public class Q31 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1,cnt=1;j<=i*2-1;j++){
                if(j<=i){
                    System.out.print(cnt);
                    if(j<i)
                        cnt++;
                }
                else
                    System.out.print(--cnt);
            }
            System.out.println();
        }
    }
}
