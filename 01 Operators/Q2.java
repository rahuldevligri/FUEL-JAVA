class Q2 {
    public static void main(String[] args) {
        int x = 100;
        double y = 100.1;
       boolean b = (x = y);
       System.out.println(b);
    }
}
//output = Error: incompatible types: possible lossy conversion from double to int