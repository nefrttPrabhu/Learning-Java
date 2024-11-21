class q38
{
    public static void main(int n)
    {
        int s=0,r=0,c=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            s=r+s*10;
        }
        if(c==s)
        System.out.print("p");
        else 
        System.out.print("n");
    }
}