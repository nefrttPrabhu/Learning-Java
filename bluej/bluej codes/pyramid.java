import java.util.*;
class pyramid
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        String s= sc.nextLine();
        s=s.trim();
        int l=s.length();
        String num="",let="";
        for(int j=0;j<l;j++)
        {
        char ch=s.charAt(j);
        if(Character.isLetter(ch))
        {
            let=let+ch;
        }
        else
        {
            num=num+ch;
        }
    }
        int n=let.length();
        int m=num.length(),k=0;
    if(m!=0&&n!=0)
    {
       for (int i = 1;i<=n;++i)
       {
      for (int space=1;space<=n-i;++space)
      {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) 
      {
       // System.out.print();
        ++k;
      }

      System.out.println();
    }
  }
       else if(m!=0)
       {
        for(int b=0;b<m;b++)
        {
            for(int a=0;a<b;a++)
            {
                System.out.print(num.charAt(a));
            }
        System.out.println();
        }
    }
    else
    {
    for(int i=0;i<n;i++)
        {
        for(int j=0;j<i;j++)
            {
                System.out.print(let.charAt(j));
            }
        System.out.println();
        } 

}
}

}
