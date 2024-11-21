class q41
{
    public static void main(int n)
    {
        int s=0,r=0,a=0,c=0;
        while(n!=0)
        {
            r=n%2;
            n=n/2;
            s=s*10+r;
            
        }
        while(s!=0)
        {
            a=s%10;
            s=s/10;
            c=10*c+a;
            
        }
        System.out.print(c);
    }
}