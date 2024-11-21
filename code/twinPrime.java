class twinPrime
{
    int x=0;
    /*public static void main(int n)
    {
        abc obj= new abc();
        abc.display(int n);
    }*/
    boolean isprime(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {   
            if(c<20) /* less than 1 will make this if false but 
                       the else make c=2 the if(c==2) is true for all then 
                       all will be printed from 3 to 23 and 
                       2 is the least to run the loop as increasing 
                       will increase the running of for loop i.e time waste*/
                {
                    if(n%i==0) //check for factors of number 
                    c ++;
            }
            else
                {
                    c++;
                    break; // prevent from extra loop running saving time 
            }
            x++; // counter for for loop running
            }
        if(c==2)
        return true;
        else 
        return false;
    }
    
    void display(int limit)
    {
        for(int i=1;i<=limit-2;i++)
        {
            boolean a,b;
            a=isprime(i);
            System.out.println(x+1);
            x=0; // counting number of time for loop is running for a
            
            b=isprime(i+2);
            System.out.println(x+1);
            x=0; // counting number of time for loop is running for b
            
            System.out.print(a);   // whats are we recieving in a in return from boolean
            System.out.println(b); // whats are we recieving in b in return from boolean
            
            if(a&&b)  // both ture tabhi toh run hoga code
            {
            System.out.println();
            System.out.print(a);   // whats are we recieving in a in return from boolean
            System.out.println(b);
            System.out.println(i+","+(i+2));
            System.out.println();
        }
    }
    }
}