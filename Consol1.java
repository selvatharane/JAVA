import java.io.Console;
public class Consol1{
    public static void main(String args[]){
       Console console=System.console();
if(console==null){
   System.out.println("Console is not available");
   return;
}
String name=console.readLine("enter your name:");
char[] password=console.readPassword("enter your password:");
console.format("your name is:%s%n",name);
console.format("your password is:%s%n",new String(password));
}
}

OUTPUT:
C:\java>javac Consol1.java

C:\java>java Consol1

enter your name:Selva
enter your password:
your name is:Selva
your password is:123
