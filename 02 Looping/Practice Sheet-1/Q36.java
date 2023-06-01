public class Q36 {
    public static void main(String[] args){
        for(int i=1;i<=13;i++){
            for(int j=1;j<=16;j++){
                if(i==5 || i==13 ||i>=5&&j==1||j>15)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
