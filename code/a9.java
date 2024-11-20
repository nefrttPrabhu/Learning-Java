import java.util.*;
class a9
{
    public static void main(int size,int num)
    {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[size];
        System.out.println("enter element");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int f=0,index=0;
        for(int i=0;i<size;i++)
        {
            if(num==a[i])
            {
                f=1;
                index=i;
                break;
            }
        }
        if(f==1)
        System.out.print("element found "+num+"index "+index);
        else 
        System.out.print("element not found "+num);
    }
}