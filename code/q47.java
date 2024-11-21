class q47
{
    public static void main(int n)
    {
        int r=0,s=0,nn=n;
        while(n!=0)
        {
            n=n/10;
            r=n%10;
            int f=1;
            for(int i=1;i<=r;i++)
            {
                f*=i;
            }
            s+=f;
        }
        if(nn==s)
        System.out.print("y");
        else 
        System.out.print("n");
    }
}