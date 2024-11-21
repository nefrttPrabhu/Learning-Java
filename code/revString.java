import java.util.*;
class revString {
    public static void main() 
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int l=s.length(),c=l-1;
        for(int i=0;i<l;i++)
        {
        System.out.print(s.charAt(c-i));
    }
    }
}