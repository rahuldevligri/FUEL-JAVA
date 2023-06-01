/*
1
2 3 4
5 6 7 8 9
 */
public class Q29 {
    public static void main(String[] args){
        for(int i=1,p=1;i<=3;i++){
            for(int j=1;j<=i*2-1;j++)
                System.out.print(p++);
            System.out.println();
        }
    }
}
