class b2d
{
    public static void main(int n)
    {
        int r,s=0,c=0;
        while(n!=0)
        {
            
            r=n%10;
            s=s+r*(int)Math.pow(2,c);
            n/=10;
            c++;
        }
        System.out.print(s);
    }
}