
import java.util.Scanner;
class employee
{
    String name;
    int age,salary;
    long phone_no;
    String address;
    Scanner sc=new Scanner(System.in);

    void read()
    {
        System.out.println("enter the name of the employee");
        name=sc.next();
        System.out.println("enter the age of the employee");
        age=sc.nextInt();
        System.out.println("enter the phone number of the employee");
        String str=sc.next();
        phone_no=Long.parseLong(str);
        System.out.println("enter the address of the employee");
        address=sc.next();
        System.out.println("enter the salary of the employee");
        salary=sc.nextInt();
    }
    void display()
    {
        System.out.println("name of the employeeis: "+name);
        System.out.println("age of the employee is: "+age);
        System.out.println("phone number of the employee is:"+phone_no);
        System.out.println("addressm of the employee is:"+address);
    }
    void print_salary()
    {
        System.out.println("Salary of the employee is: "+salary);
    }
}
class officer extends employee
{
    String spacialization;
    void read_spec()
    {
        System.out.println("enter the spacialization");
        spacialization=sc.next();
    }
    void print_spec()
    {
        System.out.println("the spacialization is: "+spacialization);
    }
}
class manager extends employee
{
    String spacialization;
    void read_spec()
    {
        System.out.println("enter the spacialized course: ");
        spacialization=sc.next();
    }
    void print_spec()
    {
        System.out.println("the spacialization is: "+spacialization);
    }
}
class empSal
{
    public static void main(String args[])
    {
        officer of=new officer();
        of.read();
        of.read_spec();
        of.display();
        
        of.print_spec();
        of.print_salary();
    }
}