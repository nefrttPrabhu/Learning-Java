import java.io.*;
class q33
{
    public int factorial(int i)
    {
        if (i==0)
        return 1;
        return i*factorial(i-1);
    }
    public static void main()
    {
        int n=4,i,j;
        q33 obj=new q33();
        for (i=0;i<=n;i++) 
        {
            for (j=0;j<=n-i;j++) 
            {
                System.out.print(" ");
            }
            for (j=0;j<=i;j++) 
            {
                System.out.print(" "+ obj.factorial(i)/(obj.factorial(i-j)*obj.factorial(j)));
            }
            System.out.println();
        }
    }
}