import java.util.Scanner;
public class waveform
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
        
        if(i+1<n){
        temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
        }
        
        i=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.printf(a[i]+"");
        }
       
        
    }
}