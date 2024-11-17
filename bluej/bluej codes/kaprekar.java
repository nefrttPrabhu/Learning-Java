import java.util.*;
class kaprekar
{
    public static void main()
    {
        System.out.println("1 for single or 2 for numbers in range");
        Scanner sc= new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println("number for range or just number as per above");
        int nn=sc.nextInt();
        switch(val)
        {
            case 2:
        for(int n=1;n<=nn;n++)
        {
        int sq=n*n,r,fh=0,sh=0,p,c=0,x=n;
        while(x!=0)
        {
            r=x%10;
            c++;
            x/=10;
        }
        p=(int)Math.pow(10,(int)c);
        fh=sq%p;
        sh=sq/p;
        int sum=fh+sh;
        int copy=n;
        if(copy==sum)
        System.out.println("y"+n);
        else
        System.out.println("n"+n);
    }
    break;
    case 1:
        int sq=nn*nn,r,fh=0,sh=0,p,c=0,x=nn;
        while(x!=0)
        {
            r=x%10;
            c++;
            x/=10;
        }
        p=(int)Math.pow(10,(int)c);
        fh=sq%p;
        sh=sq/p;
        int sum=fh+sh;
        int copy=nn;
        if(copy==sum)
        System.out.println("y");
        else
        System.out.println("n");
}
}
}
