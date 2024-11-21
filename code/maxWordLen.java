import java.util.*;
class maxWordLen
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine(),max="",y="";
        int l=s.length(),c=l-1;
        s+=' ';
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                y+=ch;
            else
            {
                if(y.length()>max.length())
                    max=y;
                    y="";
            }
        }        
        System.out.print(max);
        System.out.print(max.length());
}
}