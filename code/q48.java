class q48
{
    public static void main(int s,int e)
    {
        for(int n=s;n<=e;n++)
        {
        int r=0,sum=0,nn=n;
        while(n!=0)
        {
            n=n/10;
            r=n%10;
            int f=1;
            for(int i=1;i<=r;i++)
            {
                f*=i;
            }
            sum+=f;
        }
        if(nn==sum)
        System.out.print(sum);
 }
}
}