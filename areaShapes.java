import java.util.Scanner;
class Shapes
{
    double area(double r)
    {
        double a=3.14*r*r;
        return a;
    }
    double area(double l,double b)
    {
        double a=l*b;
        return a;
    }
}
class areaShapes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Shapes s=new Shapes();
        System.out.println("enter the radius");
        double r=sc.nextInt();
        double k=s.area(r);
        System.out.println("area of circle is "+k);
        System.out.println("enter the length");
        double l=sc.nextInt();
        System.out.println("enter the breadth");
        double b=sc.nextInt();
        double m=s.area(l,b);
        System.out.println("area of rectangle is "+m);
    }
}