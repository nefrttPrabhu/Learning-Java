
class q61
{
    public static void main(String s)
    {
        int l=s.length(),c=0,d=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            c++;
            else
            d++;
        }
        System.out.print("upper case"+c);
        System.out.print("lower case"+d);
    }
}