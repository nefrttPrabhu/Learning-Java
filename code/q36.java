import java.util.Scanner;     
public class q36 
{  
    public static void main()  
    {  
        Scanner s = new Scanner(System.in);  
        System.out.println("no of rows");
        int nrows = s.nextInt();
        int rowCount = 1;  
        for (int i = nrows; i > 0; i--)  
        {  
            for (int j = 1; j <= i*2; j++)  
            {  
                System.out.print(" ");  
            }  
            for (int j = 1; j <= rowCount; j++)            
            {  
                System.out.print(j+" ");  
            }  
            for (int j = rowCount-1; j >= 1; j--)  
            {                 
                System.out.print(j+" ");              
            }                         
            System.out.println();
            rowCount++;  
        }  
    }  
}  