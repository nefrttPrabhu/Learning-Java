class q51
{
    public static void main()
    {
        int d= 78;
        int o= dc(d);
        System.out.printf("%d in decimal = %d in octal", d, o);
    }
    public static int dc(int d)
    {
        int o= 0, i = 1;

        while (d!= 0)
        {
            o+= (d% 8) * i;
            d/= 8;
            i *= 10;
        }

        return o;
    }
}