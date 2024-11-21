class q26
{
    public static void main(int n)
    {
        int c=0,s=0,t=0;
        for(int i=0;i<n;i++)
        {
            t=t*10+1;
            System.out.print(t);
            s+=t;
            if(i<n)
            System.out.print("+");
        }
        System.out.println();
        System.out.print(s);
    }
}