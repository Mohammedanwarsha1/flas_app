import java.util.Scanner;
class matrixMul
{
    static void print_arry(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2)
    {
        if(c1!=r2)
        {
            System.out.println("can't multipy!!");
            return;
        }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        print_arry(mul);
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and column of matrix1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the rows and column of matrix2:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] b=new int[r1][c1];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        print_arry(a);
        System.out.println("matrix 2");
        print_arry(b);
        multiply(a, r1, c1, b, r2, c2);

    }
   
}