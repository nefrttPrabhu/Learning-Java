import java.io.*;
class q52
{
    static float sgp(float a, float r, int n)
    {
        float sum = 0; 
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a * r;
        }
        return sum;
    }
    public static void main(float a, float r, int n)
    {     
        System.out.printf("%.5f",(sgp(a, r, n)));
    }
      
}
  