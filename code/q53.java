class q53
{
  public static void main(long b) 
  {
    int o= bo(b);
    System.out.println(b+ " in binary = " + o + " in octal");
  }
  public static int bo(long bn) {
    int on= 0, dn= 0, i = 0;
    while (bn!= 0) {
      dn+= (bn % 10) * Math.pow(2, i);
      ++i;
      bn/= 10;
    }
    i = 1;
    while (dn!= 0) {
      on+= (dn % 8) * i;
      dn/= 8;
      i *= 10;
    }
    return on;
  }
}