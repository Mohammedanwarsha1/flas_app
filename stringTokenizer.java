//impliment java program that reads a line of interger and then display each integer and the sum of all intergers
import java.util.*;
class stringTokenizer
{
    public static void main(String args[])
    {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the interger with one space");
        String s=sc.nextLine();
        
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            String temp=st.nextToken();
            n=Integer.parseInt(temp);
            System.out.println(n);
            sum=sum+n;
        }
        System.out.println("the sum is :"+sum);
    }
}