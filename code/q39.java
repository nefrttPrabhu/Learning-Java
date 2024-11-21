class q39
{
    public static void main(int s,int e)
    {
        int sum=0;
        for(int i=s;i<=e;i++)
        {
            if(i%9==0)
            {
                System.out.print(i);
                sum+=i;
            }
        }
        System.out.print(s);
    }
}