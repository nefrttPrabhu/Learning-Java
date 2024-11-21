import java.util.*;
class maxOccur
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int s=sc.nextInt();
        int n[]= new int[s],max=0,num=0;
        System.out.println("enter elements");
        for(int i=0;i<s;i++)
            n[i]=sc.nextInt();
            
        for(int a=0;a<10;a++)
        {
            int c=0;
            for(int j=0;j<s;j++)
            {
                if(a==n[j])
                c++;
            }   
            if(max<c)
            {
                max=c;
                num=n[a];
            }    
        }
System.out.println("max elements    "+num);
System.out.println("max occurance elements   "+max);
}
}