class q30
{
    public static void main(int s,int e)
    {
        for(int i=s;i<=e;i++)
        {
            int a=i,cc=i,c=0,sum=0,r=0;
        while(a!=0)
        {
            a=a/10;
            c++;
        }
        while(i!=0)
        {
            i=i/10;
            r=i%10;
            sum+=(int)(Math.pow(r,c));
        }
        if(cc==sum)
        System.out.print(i);
        }
    }
}