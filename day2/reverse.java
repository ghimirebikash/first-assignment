import java.util.Scanner;
class reverse{

public static void main(String args[]){
int a;
int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
x = sc.nextInt();
int c=x;
int s=0;
while(x!=0){
a=x%10;
s=s*10+a;
x=x/10;
}
System.out.println(s);

}}