/*PS C:\Users\rohit\3D Objects\FUEL JAVA\04 Command Line Arguments> java Q1.java 1 2 3 4 5

output-> 15 
*/
public class Q1 {
    public static void main(String[] args){
        int sum=0;
        for (int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.print(sum);
    }    
}
