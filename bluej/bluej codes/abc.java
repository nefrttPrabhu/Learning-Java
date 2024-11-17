class abc
{
    public static void main(String x)
    {
        int i,l,c=0;char ch,cha;
        l=x.length();
        for(i=0;i<=l-2;i++)
        {
            ch=x.charAt(i);
            cha=x.charAt(i+1);
            if(ch==cha)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}