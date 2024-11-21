import java.util.Scanner;
class q42
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);    
		System.out.print("binary");
		int b=sc.nextInt();  
		int d=0;		
		int n=0;  
		while(b>0)
		{
			int r=b%10; 
			d+=r*Math.pow(2,n);  
			b=b/10;  
			n++;  
		}
		System.out.println("Decimal "+d); 
		sc.close();
	}
}