class Q12{
    public static void main(String... args){
    int x = 10;
    if(x<20 || x/0>1 || x<15 && x>=10 ) {
    System.out.println("Hello");
    } else {
    System.out.println("Hi");
    }
   }
}
/*
A variable x is declared and initialized with the value 10.
An if-else statement is used to check a condition: x < 20 || x/0 > 1 || x < 15 && x >= 10.
The first condition in the if statement is x < 20. 
This condition evaluates to true, because x is less than 20.
The 2nd condition isn't evaluates because in or(||) operater if 1st is true it will not check 2nd condition. 
The 3rd condition in the if statement is x < 15 && x >= 10. 
This condition evaluates to true, because x is less than 15 and greater than or equal to 10.
Because one of the conditions in the if statement is true,
the code inside the if block is executed, which prints the message "Hello" to the console.

x/0 > 1 This condition will result in a runtime error, 
because dividing by zero is not allowed in Java. 
Therefore, this condition will not be evaluated further.

x/0 > 1, will throw an ArithmeticException at runtime, 
because division by zero is not allowed in Java.
 */