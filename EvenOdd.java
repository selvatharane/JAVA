import java.util.Scanner;
class EvenOdd{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no:");
int num=sc.nextInt();
findOddEven(num);
}
public void findOddEven(int num)
{
if(num%2==0){
System.out.println(num+"is even");}
else{
System.out.println(num+"is odd");}
}
}
