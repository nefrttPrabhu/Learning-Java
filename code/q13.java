import java.io.*;
class q13
{
	public static void main(int n)
	{
	    int c=1;
		for (int i=0; i<n; i++)
		{
			for (int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++ )
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}
