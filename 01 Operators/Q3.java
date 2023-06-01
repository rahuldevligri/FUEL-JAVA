public class Q3 {
    public static void main(String [] args)
    {
        int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);
    }
}
/*
20<15 = false
20<22 = true
print = tiny
 */
//output= tiny