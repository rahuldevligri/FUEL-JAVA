public class Q14 {
    public static void main(String args[]) {
        int x, y, z;
        x=9;
        y=10;
        z= ++x = y++;
        }
}
/*
Q14. error: unexpected type
        z= ++x = y++;
           ^
  required: variable
  found:    value
1 error
 */
