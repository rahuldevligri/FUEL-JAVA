class A{
  public void M1(){
    System.out.println("M1 Method");
    A a=new B();
    // a.M1(); //M1 Method
   // a.M2();
/*
 error: cannot find symbol
    a.M2();
     ^
  symbol:   method M2()
  location: variable a of type A
*/
  }
}

class B extends A{
  public void M2(){
    System.out.println("M2 Method");
  }
  B b = new A();
   // b.M1();// Error 
   // b.M2();// Error
/*
 error: <identifier> expected
    b.M1();
        ^
C.java:23: error: <identifier> expected
    b.M2();
        ^
2 errors
*/
}

class C{
  public static void main(String[] args){
    A a = new A();
      //a.M1(); //M1 Method
     // a.M2();
    /*
error: cannot find symbol
      a.M2();
       ^
  symbol:   method M2()
  location: variable a of type A
    */

  B b = new B();
    //b.M1(); //M1 Method
    //b.M2(); //M2 Method
  }
}