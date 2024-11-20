class a5
{
    public static void main(int ad,int v)
    {
        int a[]={5,8,9,4,10,9};
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
