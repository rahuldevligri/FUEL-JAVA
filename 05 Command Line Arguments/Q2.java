/*
PS C:\Users\rohit\3D Objects\FUEL JAVA\04 Command Line Arguments> java Q2.java "Hello World By Java" "Hello" "HI" "Bye"

4
Hello World By Java
Hello
HI
Bye 
*/
public class Q2 {
    public static void main(String[] args){
        System.out.println(args.length);

        for(int i=0;i<args.length;i++){
                System.out.print(args[i]);
            System.out.println();
        }
    } 
}
