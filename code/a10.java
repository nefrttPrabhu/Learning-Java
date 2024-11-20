import java.util.*;
class a10
{
public static void main(int m, int n,int v)
{
    Scanner sc= new Scanner(System.in);
	int a[][]=new int[m][n];
	for(int i = 0; i < m;i++)
	{
		for(int j = 0; j < n; j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	int x=0,y=0,f=0;
	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			if(a[i][j] == v)
			{
				f=1;
				x=i;y=j;
				break;
			}
		}
	}
	if(f==1)
	{
	    System.out.println(a[x][y]);
	    System.out.print("index row and column"+x+","+y);
 }
 else{
     System.out.print("not found");
 }
}
}