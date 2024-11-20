class LeadersArray
{
    public static void main()
    {
        int a[]={2,4,6,3,1,2},l=a.length;
        String t="";
        for(int j=0;j<l;j++)
        {
            for (int i=j+1;i<l;i++)
            {
                if(a[j]>a[i])
                {
                    if(i==l-1)
                    {
                        t=t+a[j];
                    }
                }
                else
                    break;
            }
        }
        System.out.print(t);
    }
}