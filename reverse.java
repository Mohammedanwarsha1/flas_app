import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        int n,rev=0;
        System.out.println("enter the number to reverse");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("the reverse number is "+rev);
    }
}