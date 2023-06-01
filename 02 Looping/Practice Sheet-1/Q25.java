/*
A 
B C
D E F
G H I J
K L M N O
P Q R S T U
V W X Y Z [ \
 */
public class Q25 {
    public static void main(String args[]){
        char c=65;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++,c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }    
}
