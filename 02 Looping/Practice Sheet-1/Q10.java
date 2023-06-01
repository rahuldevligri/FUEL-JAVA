/*
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
*/

public class Q10 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=1,p=1;j<=5;j++){
                if(j>=i)
                    System.out.print(p++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
