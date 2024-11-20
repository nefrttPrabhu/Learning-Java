class a2q5
{
    public static void main(int v,int ad)
    {
        int a[]={1,2,3,4,5,6};
        int l=a.length;
        int temp[]=new int[l];
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(i==ad)
            {
                temp[i]=v;
                c++;
            }
            else
            {
                temp[i]=a[c];
                c++;
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(temp[i]);
        }
    }
}