class atm
{
    synchronized void checkBalance(String name)
    {
        System.out.println(name+"checking ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
        System.out.println("balance");
    }
    synchronized void withdraw(String name,int amount)
    {
        System.out.println(name+"withdrawing");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
        System.out.println(amount);
    }
}
class customer extends Thread
{
    String name;
    int amount;
    atm at;
    customer(String n,atm a,int amt)
    {
        name=n;
        amount=amt;
        at=a;
    }
    void useAtm()
    {
        at.checkBalance(name);
        at.withdraw(name, amount);
    }
    public void run()
    {
        useAtm();
    }
}
class thread1
{
    public static void main(String args[])
    {
        atm a=new atm();
        customer c1=new customer("anwar", a, 1000);
        customer c2=new customer("manu", a, 2000);
        c1.start();
        c2.start();
    }
}