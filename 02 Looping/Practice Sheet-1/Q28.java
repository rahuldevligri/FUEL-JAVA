/*
1 
1 2 1 
1 2 4 2 1 
1 2 4 8 4 2 1 
1 2 4 8 16 8 4 2 1 
1 2 4 8 16 32 16 8 4 2 1 
1 2 4 8 16 32 64 32 16 8 4 2 1 
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 
 */
public class Q28 {
    public static void main(String args[]){
        for(int i=1;i<=8;i++){
            //int p=cnt;
            for(int j=1,cnt=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print(cnt+" ");
                    if(j<i)
                        cnt*=2;
                }
                else{
                    cnt/=2;
                    System.out.print(cnt+" ");
                    
                }
                
            }
            System.out.println();
        }
    }
}
