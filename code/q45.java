class q45
{
  public static void main(int n1,int n2) 
  {
    int lcm;
    lcm=(n1>n2)?n1:n2;
    while(true) 
    {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) 
      {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}