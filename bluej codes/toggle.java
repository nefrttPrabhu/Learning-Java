import java.util.*;
class toggle
{
    public static void main(String x)
    {
        int i,l;char ch;
        String y="A,E,I,O,U,a,e,i,o,u",z="";
        l=y.length();
        for(i=0;i<=l-1;i++)
        {
            ch=x.charAt(i);
            if(y.indexOf(ch)!=-1)
            ch++;
            z+=ch;
        }
            System.out.println(z);
    }
}