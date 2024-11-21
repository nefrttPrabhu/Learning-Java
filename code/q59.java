class q59
{
    public static void main(int n)
    {
        int a=n,cc=n,c=0,s=0,r=0;
        while(a!=0)
        {
            a=a/10;
            c++;
        }
        while(n!=0)
        {
            n=n/10;
            r=n%10;
            s+=(int)(Math.pow(r,c));
        }
        if(cc==s)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}