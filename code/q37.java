class q37
{
    public static void main(int n)
    {
        int s=0,r=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            s=r+s*10;
        }
        System.out.print(s);
    }
}