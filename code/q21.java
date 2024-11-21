import java.io.*;
class q21

{
    public static void main(int n)
    {
        int s=0;
        for(int j=0;j<=n;j++)
        s=s+(((int)(Math.pow(10,j) - 1)));
        System.out.print(s);
}
}