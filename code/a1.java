import java.util.*;
class a1
{
    public static void main(int size)
    {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=1;i<size;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.print("max element"+max);
    }
}