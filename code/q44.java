import java.util.*;
class q44
{
    public static void main()
    {
        int a, b;
        System.out.println("Enter the a and b value");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int x = a;
        int y = b;
        while (x != y) 
        {
            if (x > y) 
            {
                x = x - y;
            } else 
            {
                y = y - x;
            }
        }
        System.out.println("LCM of a&b=" + ((a * b)) / x);
    }
}