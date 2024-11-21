class q22
{
    public static void main(int n)
    {
        int c=0;
        for(int j=1;j<=n;j++)
        {
        for(int i=0;i<j;i++)
        {
            if(c%2==0)
            {
              c++;
              System.out.print(c);
        
    }
        else
        {
            c--; 
         System.out.print(c);
          
        }
        
    }
            System.out.println("");
}
}
}