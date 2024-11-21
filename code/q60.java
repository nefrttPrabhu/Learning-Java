
class q60
{
    public static void main(String s)
    {
        int l=s.length(),c=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            c++;
        }
        System.out.print("characters"+c);
    }
}