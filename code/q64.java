class q64
{
    public static void main(int ad)
    {
        int a[]={1,2,3,4,5};
        int l=a.length;
        int temp[]=new int[l-1];
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            if(i==ad)
            {
                temp[i]=a[c+1];
                c+=2;
            }
            else
            {
               /* if(c>l-1)
                break;
                else{  //sab same hai l-1 vo kaam kar de raha hai jo if kar raha hai*/
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
