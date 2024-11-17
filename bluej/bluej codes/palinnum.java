class palinnum 
{
    public static void main(int n)
    {
        int s=0,r=0,nn=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(nn==s)
        System.out.println("y");
        else
        System.out.println("n");
    }
}