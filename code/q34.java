class q34
{
    int prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    void main(int s,int e)
    {
        int c=0;
        for(int i=s;i<=e;i++)
        {
            int a=prime(i);
            if(a==1)
            System.out.print(i+" ");
        }
    }
}