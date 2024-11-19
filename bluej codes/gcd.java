class gcd
{
    public static void main(int x,int y)
    {
        int r;
        do
        {
            r=x%y;
            x=y;
            y=r;
        }
        while(r!=0);
        System.out.print(x);
    }
}