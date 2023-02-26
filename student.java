import java.util.Scanner;
class student1
{
    String name;
    int roll_no;
    int[]mark;

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of student");
        name=sc.next();
        System.out.println("enter the roll number");
        roll_no=sc.nextInt();
        System.out.println("enter the mark of %subject");
        mark=new int[10];
        for(int i=0;i<5;i++)
        {
            mark[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("student name is:"+name);
        System.out.println("roll number is:"+roll_no);
        for(int i=0;i<5;i++)
        {
            System.out.println("mark of subject"+(i+1)+"is"+mark[i]);
        }
    }
}
class student
{
    public static void main(String args[])
    {
        student1 s=new student1();
        System.out.println("enter the student details...");
        s.read();
        System.out.println("The student details are");
        s.display();

    }
}