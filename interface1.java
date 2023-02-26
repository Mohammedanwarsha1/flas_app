interface member
{
    void callBack();
}
class store
{
    member mem[]=new member[10];
    int count=0;
    void register(member m)
    {
        mem[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callBack();
        }
    }
}
class customer implements member
{
    String name;
    customer(String n)
    {
        name=n;
    }
    public void callBack()
    {
        System.out.println("OK I WILL CALL BACK"+name);
    }
}
class interface1
{
    public static void main(String args[])
    {
        store s=new store();
        customer c1=new customer("john");
        customer c2=new customer("shanu");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}