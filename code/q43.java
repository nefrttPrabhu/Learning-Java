import java.util.Scanner;
class q43 
{
   public static void main()
   {
      int a,b,i,hcf=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("first");
      a = sc.nextInt();
      System.out.println("second");
      b = sc.nextInt();
      for(i=1;i<=a||i<=b;i++) 
      {
         if(a%i==0&&b%i==0 )
         hcf=i;
      }
      System.out.println("HCF "+hcf);
   }
}