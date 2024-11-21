import java.io.*;
class q14
{
	public static void main(int n)
	{
		for (int i=0; i<n; i++)
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
