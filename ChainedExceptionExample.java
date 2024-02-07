public class ChainedExceptionExample {
public static void main(String[] args) {
try {
// Simulating a divide by zero exception
int result = divide(10, 0);
System.out.println("Result: " + result);
}
 catch (Exception e) {
// Creating a new exception and chaining the original exception
throw new RuntimeException("An error occurred: ", e);
}
}
public static int divide(int a, int b)
 {
if (b == 0)
 {
throw new ArithmeticException("Division by zero");
}
return a / b;
}
}
