public class Q11 {
        static int i = 5;
        public static void main(String... args){
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);System.out.println(++i+i++);
        }
}
/*Print-1
the value of i is printed using System.out.println, 
which also increments the value of i by 1 using the post-increment operator i++:
        System.out.println(i++);
This will print 5, because the initial value of i is 5. 
*/

/*Print-2
The next line also prints the value of i,
but this time i has already been incremented in the previous line, 
so its value is 6:
    System.out.println(i); 
This will print 6.
 */

/*print-3
The third line again prints the value of i, 
but this time i is incremented before it is printed, 
because of the pre-increment operator ++i:
    System.out.println(++i);
This will print 7.
 */

/*Print-4
Finally, the last line prints the result of an expression 
that contains two increments and one addition operation:
    System.out.println(++i + i++);
This expression is evaluated from left to right.
First, i is incremented to 8 because of the pre-increment operator ++i. 
Then, i is added to the current value of i, which is 8, resulting in 16. 
However, the value of i is also incremented again using 
the post-increment operator i++, so its value becomes 9.

Therefore, the final output of this line is 16, 
and the value of i after executing this line is 9.
 */