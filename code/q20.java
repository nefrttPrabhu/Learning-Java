import java.io.*;
class q20
{
	public static void main(int n)
	{
	    int c=1;
		for (int i=0; i<n; i+=2)
		{
			for (int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
