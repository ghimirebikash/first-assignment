import java.util.Scanner;
class prime1{

    public static void main(String[] args) {
 int count=0;
        int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter number to check");
x = sc.nextInt();
       
        for(int i=2;i<=x;i++){
count=0;
        for(int j = 2; j <=i/2; ++j)
        {
            
            if(i % j == 0)
            {
                count=1;
                 
            }
           
        }
if(count==0){
 System.out.println(i + " is a prime number.");
            
       }
}
}}



