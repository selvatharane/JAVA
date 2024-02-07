import java.lang.*;
class builtin
{
public static void main(String args[])
{
double radius=5.0;
double area;
area=Math.PI*Math.pow(radius,2);
System.out.println("Area:"+area);
String message="LEARNING JAVA!!";
int length=message.length();
System.out.println("Lenght:"+length);
int number=42;
String binary=Integer.toBinaryString(number);
System.out.println("Binary"+binary);
}
}
