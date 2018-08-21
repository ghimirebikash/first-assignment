import java.util.Scanner;
public class checknum
{
    public static void main(String[] args) 
    {int count=1;
        int n,o, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
 System.out.print("Enter no to check ");
        o = s.nextInt();
        for (int i = 0; i < n; i++) 
        {
          if (a[i] ==o) 
                {
        count=0;
break;
        
        }
        }
       if (count==0)
        {
            System.out.print("number found");
        }else{
        System.out.print("number not found");
}
    }
}