class A{
    int x;
    int y;
    static int z; //only one copy generate of static variable...

    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

public class CASE_3 {
    public static void main(String[] args){
        A a1 = new A();
        a1.x=10;
        a1.y=20;
        a1.z=30;
        
        A a2 = new A();
        a2.x=40;
        a2.y=50;
        a2.z=60;
                     // x  y  z
        a1.display();// 10 20 60
        a2.display();// 40 50 60
        
    }    
}
