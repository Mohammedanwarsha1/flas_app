import java.util.Scanner;
class trace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size");
        int r=sc.nextInt();
        System.out.println("Enter the col size");
        int c=sc.nextInt();
        System.out.println("Enter the elements in matrix");
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("the trace of the matrix is:"+sum);
    }
}