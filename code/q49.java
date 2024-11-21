class q49
{
    static float sumOfAP(float a, float d, int n)
    {
        float sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
    public static void main(float a, float d, int n)
    {
        System.out.println(sumOfAP(a, d, n));
    }
}