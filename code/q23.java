class q23
{
    public static void main(int n,int x)
    {
        int c=0,s=0;
        for(int i=1;i<(2*n);i=i+2)
        {
            if(c%2==0)
            s+=(int)Math.pow(x,i);
            else
            s-=(int)Math.pow(x,i);
            c++;
        }
        System.out.print(s);
    }
}