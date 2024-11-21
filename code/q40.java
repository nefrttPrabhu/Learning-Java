import java.util.*;
class q40
{
	public static void main(int n)
	{
		int i,j;
    		for(i=1;i<=n;i++)
    		{
	       		for(j=1;j<=n-i;j++)
        		{
     				System.out.printf(" ");
			} 	
	       		for(j=1;j<=i;j++)
        		{
     				System.out.printf("%c ",(char)(j+64));
			} 			
	       		for(j=i-1;j>=1;j--)
        		{
     				System.out.printf("%c ",(char)(j+64));
			} 			
        		System.out.println();
    		}
	}
}