class q28
{
    public static void main(int s,int e)
    {
        int c=0;
        for(int n=s;n<=e;n++){
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c+=i;
            }
        }
        if(c==n)
        System.out.print("y");
        else 
        System.out.print("n");
    }
}
}