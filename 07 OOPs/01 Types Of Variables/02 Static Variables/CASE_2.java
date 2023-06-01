/*
when we load B class in JVM
output -> 0 0
*/

//when we load A class in JVM
/*output-> error 
.java:12: error: cannot find symbol
        System.out.println(x);//  -> ErrOr
                           ^
  symbol:   variable x
  location: class B
B.java:13: error: cannot find symbol
        System.out.println(y);// -> eRRoR
                           ^
  symbol:   variable y
  location: class B
2 errors
*/

class A {
    static int x;
    static int y;
    public static void main(String[] args){
        System.out.println(x);//0
        System.out.println(y);//0
    }    
}

class B{
    public static void main(String[] args){
        System.out.println(x);// -> ErrOr
        System.out.println(y);//  -> eRRoR
        System.out.println(A.x);//0
        System.out.println(A.y);//0
    }  
}
