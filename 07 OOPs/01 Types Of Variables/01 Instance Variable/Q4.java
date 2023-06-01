/*
when you load class Institute in JVM output=
RahulTonk
Rohitjaipur
*/
class Student{
    String name,add;

    public void display(){
        System.out.printf(name);
        System.out.println(add);
    }
}

class Institute{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Rahul";
        s1.add="Tonk";

        Student s2=new Student();
        s2.name="Rohit";
        s2.add="jaipur";

        s1.display();
        s2.display();

    }
}

