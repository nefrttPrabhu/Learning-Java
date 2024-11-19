import java.util.*;
class match
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        int i,l1,l2,c=0;
        String z;
        l1=x.length();
        l2=y.length();
        for(i=0;i<=l1-l2;i++)
        {
            z=x.substring(i,i+l2);
            if(z.equalsIgnoreCase(y))
            c++;
        }
        System.out.println(c);
    }
}