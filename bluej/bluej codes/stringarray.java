import java.util.*;
class stringarray
{
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[5];
        for(int i=0;i<=4;i++)
        {
            name[i]=sc.nextLine();
        }
        String small="";
        int p=0;
        String temp="";
        for(int j=0;j<=4;j++)
        {
            small=name[j];
            p=j;
            for(int k=j+1;k<=4;k++)
            {
            if(small.compareTo(name[k])>0)
            {
                small=name[k];
                p=k;
            }
        }
        temp=name[j];
        name[j]=name[p];
        name[p]=temp;
    }
    for(int t=0;t<=4;t++)
    System.out.println(name[t]);
}
}