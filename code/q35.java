class q35
{
    public static void main(int n)
    {
        int a=0,b=1,c=0;
        for(int i=1;i<=10;i++)
        {
            a=b;
            b=c;
            System.out.print(c);
            c=a+b;
        }
    }
}