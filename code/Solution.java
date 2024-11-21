
import java.util.*;
class Solution 
{
    public void rotate(int size, int k) 
    {
        Scanner sc = new Scanner(System.in);
        int nums[]=new int[size];
        for(int i=0;i<size;i++)
        nums[i]=sc.nextInt();
        int c=k;
for(int i=0;i<size;i++)
{
    if(i>=k)
    {
        System.out.print(nums[c]);
        c++;
    }
    
    else
    {
    System.out.print(nums[size-c]);
    c--;
    }
}
    }
}