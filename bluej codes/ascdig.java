class ascdig
{
    public static void main(int n)
    {
        int r=0,i,a=0,s=0,x;
        for(i=1;i<=9;i++)
        {
            int f=0;
            x=n;
            while(x!=0)
            {
            r=x%10;
            if(r==i)
            {
            f=1;
            s=s*10+r;
            break;
            }
            x/=10;
            if(f==1)
            break;
            }
        }
        System.out.print(s);
}
}