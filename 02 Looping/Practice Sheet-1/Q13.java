/*
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
6 12 18 24 30 36
7 14 21 28 35 42 49
8 16 24 32 40 48 56 64
 */
public class Q13 {
    public static void main(String args[]){
        for(int i=1;i<=8;i++){
            //System.out.println("p= "+p);
            for(int j=1,p=1;j<=i;j++,p++){
                    System.out.print((p*i)+" ");
            }
            System.out.println();
        }
    }
}
