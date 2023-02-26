import java.util.Scanner;
abstract class shape1
{
    abstract void no_of_sides();
}
class rectangle extends shape1
{
    void no_of_sides()
    {
        System.out.println("the number of sides of rectangle is 4");
    }
}
class triangle extends shape1
{
    void no_of_sides()
    {
        System.out.println("the number of sides of triangle is 3");
    }
}
class hexagon extends shape1
{
    void no_of_sides()
    {
        System.out.println("the number of sides of hexagon is 6");
    }
}
class shape
{
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        triangle t=new triangle();
        hexagon h=new hexagon();

        r.no_of_sides();
        t.no_of_sides();
        h.no_of_sides();
    }
}