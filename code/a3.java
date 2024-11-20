import java.util.*;
class a3
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int a[]={45,12,78,23,9,65,87,34},s=0; 
        int l=a.length;
        for(int i=0;i<l;i++)
        {
            s+=a[i];
        }
        System.out.print("sum of array elements  "+s);
    }
}