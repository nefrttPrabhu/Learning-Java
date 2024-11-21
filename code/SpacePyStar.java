class SpacePyStar
{
     void main(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<(n-1);j++)
            System.out.print(" ");
            for(int k=i;k>=0;k--)
            {
               System.out.print("*");
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}