/*
Write a program to check whether a given matrix is skew symmetric Matrix or not?
 */
public class Q5_CheckSkewSymmetricMatrix {
    public static void main(String[] args){
        int[][] a={{1,-4,5},{4,2,-6},{-5,6,3}};
        int[][] result=new int[a[0].length][a.length];
        boolean flag=true;
        int i,j;
        if(a.length==a[0].length){
            for(i=0;i<a.length;i++){
                for(j=0;j<a[i].length;j++){
                    result[j][i]=a[i][j];
                }
            }
            for(i=0;i<a.length;i++){
                for(j=0;j<a[i].length;j++){
                    if(a[i][j]==-(result[j][i])){
                        flag=false;
                        System.out.println(a[i][j]+" "+result[i][j]);
                        break;
                    } 
                } 
                if(flag==false){
                    break;
                }
            }
            if(flag==true){
                System.out.print("its simatrix matrix---");
            }
            else{
                System.out.print("its not..");
            }
        }
    }
}
