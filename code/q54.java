class q54
{
    public static void main()
    {
        int o= 12;
        int d= 0;
        int n= 0;
        while(o> 0)
        {
            int temp = o% 10;
            d += temp * Math.pow(8, n);
            o= o/10;
            n++;
        }

        int b[] = new int[20];
        int i = 0;
        while(d> 0)
        {
            int r = d % 2;
            b[i++] = r;
            d = d/2;
        }
        System.out.print("Binary number : ");

        for(int j = i-1 ; j >= 0 ; j--)
            System.out.print(b[j]+"");

    }
} 