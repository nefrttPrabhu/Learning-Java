import java.util.*;
class physics_first
{
     public static void main(String args[])
    {
        double g,s,mu;int c=0;
     g=9.81;
     s=1;
     mu=0.005;
        double a[]=new double[25];
        double m[]=new double[25];
        double M[]=new double[25];
        double t[]=new double[25];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<25;i++)
        {
            System.out.println("input m,M");
            m[i]=sc.nextDouble();
            M[i]=sc.nextDouble();
            a[i]=(M[i]-((m[i]*mu)*g))/(m[i]+M[i]);
            t[i]=Math.sqrt((2*s)/a[i]);
        }
        double f=0.0,tm=0.0,ma=0.0,ca=0.0,ea=0.0,pe=0.0;
        System.out.println("mass\tMass\ttime\tforce\ttotal-mass\tmeasured-value\tcalculated_acc\terror\tpercentage_error");
        for(int j=0;j<25;j++)
        {
         c++;      
         f=(m[j]*g-mu*M[j]*g);
         tm=m[j]+M[j];
         ma =f/tm;
         ca=(2*s)/(t[j]*t[j]);
         ea=(ca-ma)/ma;
         pe=ea*100;
         System.out.println(m[j]+"\t"+M[j]+"\t"+t[j]+"\t"+f+"\t"+tm+"\t"+ma+"\t"+ca+"\t"+ea+"\t"+pe);
    }
    System.out.print(c);
}
}