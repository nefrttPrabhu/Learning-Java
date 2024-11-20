class a4
{
    public static void main(int ad,int v)
    {
        int a[]={3,6,9,2,1};
        int l=a.length;
        l+=1;
        int temp[]=new int[l];
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(i==ad)
            {
                temp[i]=v;
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
