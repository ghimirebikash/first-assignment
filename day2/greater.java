import java.util.Scanner;
class greater{
public static void main(String args[]){
double x;
double y;
double z;
Scanner sc = new Scanner(System.in);
System.out.println("enter first number");
x = sc.nextDouble();
System.out.println("enter second number");
y = sc.nextDouble();
System.out.println("enter second number");
z = sc.nextDouble();
if(x>=y && x>=z){
System.out.println("greater number is=" + x);
}
else if(y>=x && y>=z){
System.out.println("greater number is=" + y);
}
else
{
System.out.println("greater number is=" + z);
}

}}	