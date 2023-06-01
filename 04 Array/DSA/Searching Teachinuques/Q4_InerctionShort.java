import java.util.Scanner;;
public class Q4_InerctionShort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input array Size
        System.out.print("Enter Array Size: ");
        int size=sc.nextInt();

        //array creation
        int[] array = new int[size];

        //array input
        for(int i=0;i<array.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            boolean flag= false;
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    flag=true;
                }
                else
                    break;
            }
            if(flag==false){
                break;
            } 
        }
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]);
        }

    }
}
