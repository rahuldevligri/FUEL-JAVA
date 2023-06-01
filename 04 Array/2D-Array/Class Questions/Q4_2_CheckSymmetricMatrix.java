/*
Write a program to check whether a given Matrix is symmetric Matrix or not?
 */
public class Q4_2_CheckSymmetricMatrix {
    public static void main(String[] args){
        int[][] a={{1,2,3},{2,4,5},{3,5,6}};
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
                    if(a[i][j]!=result[i][j]){
                        flag=false;
                        System.out.print(a[i][j]+" "+result[i][j]);
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
