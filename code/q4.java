import java.util.*;
class q4
{
    public static void main(int n)
    {
    Scanner sc = new Scanner(System.in);
    
        int s=0,a,c=0;
        for(int i=1;i<=n;i++)
        {
        a=sc.nextInt();
        s+=a;
        c++;
    }
    System.out.print(s);
    System.out.print("avg"+(double)(s/c));
}
}