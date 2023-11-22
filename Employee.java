class Employee
{
   int id;
   String name;
   String designation;

Employee(int i,String n)
{
   id=i;
   name=n;
}

Employee(int i,String n,String d)
{
   id=i;
   name=n;
   designation=d;
}
 
void display()
{
  System.out.println(id+" "+name+" "+designation);
}
public static void main(String args[])
{
  Employee e1=new Employee(19,"Selva");
  Employee e2=new Employee(19,"Selva","administrator");
  e1.display();
  e2.display();
}
}
  