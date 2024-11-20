class a2q1
{
    public static void main(int v)
    {
        int a[]={1,2,3,4,5,6};
        int l=a.length;
        int c=0,cc=0;
        String s="";
        for(int i=0;i<l;i++)
        cc++;
        if(l==cc)
        {
            for(int i=0;i<l;i++)
            {
                s=s+a[i];
            }
            s=s+v;
            int ll=s.length();
            int tem[]=new int[ll];
            for(int i=0;i<ll;i++)
            {
                char ch=s.charAt(i);
                tem[i]=ch;
            }
            for(int i=0;i<l;i++)
        {
            System.out.print(tem[i]);
        }
        }
        else
        {
        a[l-1]=v;
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]);
        }
    }
}
}