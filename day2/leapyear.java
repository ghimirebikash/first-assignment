import java.util.Scanner;
class Leapyear 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year:");
        int year = sc.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println(+year+" is a Leap Year");
        }
 else
        {
            System.out.println(+year+" is not a Leap Year");
        }
    }
}