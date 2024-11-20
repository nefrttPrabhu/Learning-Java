class Binary
{
    void main(int v)
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int l=a.length;
        
        int ub=l-1,lb=0,m=0;
        while(ub<=lb)
        {
            m=(lb+ub)/2;
        if(a[m]==v)
        {
            System.out.print("yes");
            break;
        }
        else if(a[m]>v)
        {
            ub=m-1;
        }
        else
        {
            lb=m+1;
        }
}
System.out.print("not");
}
}
