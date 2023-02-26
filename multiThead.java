import java.io.*;
class A implements Runnable
{
 public void run()
 {
 System.out.print("Even numbers are: ");
 for(int i=0;i<=100;i++)
 {
 if(i%2==0)
 System.out.print(i+" ");
 }
 System.out.print("\nExit from A");
 }
}
class B implements Runnable
{
 public void run()
 {
 System.out.print("\nOdd numbers are: ");
 for(int i=1;i<=100;i+=2)
 {
 if(i%2!=0)
 System.out.print(i+" ");
 }
 System.out.print("\nExit from B");
 }
}
class multiThead
{
 public static void main(String args[]) throws InterruptedException
 {
 A even=new A();
 B odd=new B();
 Thread t1=new Thread(even);
 Thread t2=new Thread(odd);
 t1.start();
 t1.join();
 t2.start();
 }
}
