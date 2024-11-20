class a6
{
    public static void main(int v)
    {
        int a[]={10,20,30};
        int l=a.length;
        l+=1;
        int temp[]=new int[l];
        int c=0;
        temp[0]=v;
        for(int i=1;i<l;i++)
        {
                temp[i]=a[c];
                c++;
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(temp[i]);
        }
    }
}
