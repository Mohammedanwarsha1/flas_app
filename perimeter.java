import java.util.Scanner;
class perimeter1
{
    perimeter1(double r)
    {
        double a=2*3.14*r;
        System.out.println("perimeter of circle is: "+a);
    }
    perimeter1(double l,double b)
    {
        double a=2*(l+b);
        System.out.println("perimeter of rectangle is: "+a);
    }
}
class perimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter th radius of circle");
        double r=sc.nextInt();
        perimeter1 p=new perimeter1(r);

        System.out.println("Enter th length of rectangle");
        double l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        double b=sc.nextInt();
        perimeter1 p1=new perimeter1(l,b);
        



    }
}