public class Q4_1 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++)
        {
            for(int j=1,p=1;j<=i;j++,p++)
            {
                if(p>1) {
                    p = 0;
                    System.out.print(p);
                }
                else
                    System.out.print(p);
            }
            System.out.println();
        }
    }
}
