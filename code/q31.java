import java.util.Scanner;
class q31
{
public static void main (int rows)
{
for(int i=1; i<=rows; i++)
{
    for(int j=1; j<=rows-i; j++)
    {
      System.out.print(" ");
}
for(int k=1; k<=i; k++)
{
      System.out.print("*"+" ");
}
System.out.println();
}
for(int i=1; i<=rows-1; i++)
{  
    for(int j=1; j<=i; j++)
    {
      System.out.print(" ");
}
for(int k=1; k<=rows-i; k++)
{
      System.out.print("*"+" ");
}
System.out.println();
        }
    }
}