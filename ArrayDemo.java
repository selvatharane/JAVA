import java.util.Scanner;
 public class ArrayDemo {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Create an array of integers
 int[] arr = { 1, 2, 3, 4, 5 };
 while (true) {
 System.out.print("Enter the index to access the array: ");
 try {
 int index = scanner.nextInt();
 // Attempt to access the array element
 int element = arr[index];
 System.out.println("Element at index " + index + " is: "+ element);
 break; // Break out of the loop if the index is valid
 }
catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Invalid index. Please try again.");
 scanner.nextLine(); // Clear the input buffer
 }
 catch (Exception e) {
System.out.println("An unexpected error occurred.");
 e.printStackTrace();
 break;
}
}
scanner.close();
 }}
