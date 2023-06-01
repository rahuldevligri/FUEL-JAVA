/*
Q1.java:5: error: non-static variable a cannot be referenced from a static context
            System.out.println(a);
                               ^
Q1.java:6: error: non-static variable b cannot be referenced from a static context
            System.out.println(b);
                               ^
2 errors
 */
public class Q1 {
    int a=10;
    int b=20;
        public static void main(String[] args){
            System.out.println(a);
            System.out.println(b);
        }
}
