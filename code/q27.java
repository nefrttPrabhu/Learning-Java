class q27
{
    public static void main(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s==n)
        System.out.print("y");
        else 
        System.out.print("n");
    }
}