class smallformed
{
    public static void main(int n)
    {
        int s=0,r;
        for(int i=1;i<=9;i++)
        {
            int x=n;
            while(x!=0)
            {
                r=x%10;
                if(r==i)
                s=s*10+r;
                x/=10;
            }
        }
        System.out.print(s);
    }
}