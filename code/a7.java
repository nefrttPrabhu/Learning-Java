class a7
{
    public static void main(int v)
    {
        int a[]={15,25,35,45};
        int l=a.length;
        int temp[]=new int[l-1];
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            if(a[i]==v)
            {
                temp[i]=a[c+1];
                c+=2;
            }
            else
            {
                temp[i]=a[c];
                c++;
            
            }
        }
        for(int i=0;i<l-1;i++)
        {
            System.out.print(temp[i]);
        }
    }
}
