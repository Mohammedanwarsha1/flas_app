import java.util.*;
class palindrom1
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int flag=0;
        int len=str.length();
        for(int i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
