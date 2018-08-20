import java.util.Scanner;
class Prime {

    public static void main(String[] args) {

        int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter number to check");
x = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i <=x/2; ++i)
        {
            
            if(x % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(x + " is a prime number.");
        else
            System.out.println(x + " is not a prime number.");
    }
}



