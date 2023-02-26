import java.time.OffsetDateTime;
import java.util.*;
class Employee1
{
    String name;
    int age;
    long phoneNo;
    Double Salary;
    String Address;

    void setName(String name)
    {
        this.name=name;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    void setphoneNo(long phoneNo)
    {
        this.phoneNo=phoneNo;
    }
    void setSalary(Double Salary)
    {
        this.Salary=Salary;
    }
    void setAddress(String Address)
    {
        this.Address=Address;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    long getLongPhoneNo()
    {
        return phoneNo;
    }
    Double printSalary()
    {
        return Salary;
    }
    String getAddress()
    {
        return Address;
    }
}
class officer extends Employee1
{
    String spacialization;
    String Department;
    void setSpacialization(String spacialization)
    {
        this.spacialization=spacialization;
    }
    void setDepartment(String Department)
    {
        this.Department=Department;
    }
    String getSpacialization()
    {
        return spacialization;
    }
    String getDepartment()
    {
        return Department;
    }
}
class Manager extends Employee1
{
    String spacialization;
    String Department;
    void setSpacialization(String spacialization)
    {
        this.spacialization=spacialization;
    }
    void setDepartment(String Department)
    {
        this.Department=Department;
    }
    String getSpacialization()
    {
        return spacialization;
    }
    String getDepartment()
    {
        return Department;
    }
}
class Employee
{
    public static void main(String agrs[])
    {
        officer of=new officer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the officer's details");
        System.out.println("Name");
        of.setName(sc.nextLine());
        System.out.println("Age");
        of.setAge(sc.nextInt());
        System.out.println("PhoneNumber");
        of.setphoneNo(sc.nextLong());
        System.out.println("Salary");
        of.setSalary(sc.nextDouble());
        System.out.println("Address");
        of.setAddress(sc.nextLine());
        System.out.println("Spacialization");
        of.setSpacialization(sc.nextLine());
        System.out.println("Department");
        of.setDepartment(sc.nextLine());
        System.out.println("Name is:"+of.getName());
        System.out.println("Age is"+of.getAge());
        System.out.println("phone number is:"+of.getLongPhoneNo());
        System.out.println("Salary is "+of.printSalary());
        System.out.println("Address is"+of.getAddress());
        System.out.println("spacialization is:"+of.getSpacialization());
        System.out.println("Department is :"+of.getDepartment());

        System.out.println("Enter manager details");
        Manager m=new Manager();
        System.out.println("Name");
        m.setName(sc.nextLine());
        System.out.println("Age");
        m.setAge(sc.nextInt());
        System.out.println("PhoneNumber");
        m.setphoneNo(sc.nextLong());
        System.out.println("Salary");
        m.setSalary(sc.nextDouble());
        System.out.println("Address");
        m.setAddress(sc.nextLine());
        System.out.println("Spacialization");
        m.setSpacialization(sc.nextLine());
        System.out.println("Department");
        m.setDepartment(sc.nextLine());
        System.out.println("Name is:"+m.getName());
        System.out.println("Age is"+m.getAge());
        System.out.println("phone number is:"+m.getLongPhoneNo());
        System.out.println("Salary is "+m.printSalary());
        System.out.println("Address is"+m.getAddress());
        System.out.println("spacialization is:"+m.getSpacialization());
        System.out.println("Department is :"+m.getDepartment());
    }
}