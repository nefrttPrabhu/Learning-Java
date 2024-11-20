class abc
{
    void main()
    {
        char a[]=new char[10];
        a[0]='a';
        a[1]='b';
        a[3]='c';
        a[2]='d';
        String s="";
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]);
            s=s+a[i];
        }
        System.out.println();
        System.out.print(s);
        System.out.print(a[4]);
    }
}