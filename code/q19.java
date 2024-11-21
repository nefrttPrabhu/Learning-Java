class q19
{
    public static void main(int n)
    {
        float s=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print("1/"+i);
            if(i<n)
            System.out.print("+");
            s+=(1/i);
        }
        System.out.print(s);
}
}