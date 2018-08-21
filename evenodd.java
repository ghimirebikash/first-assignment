import java.util.Scanner;
class evenodd{

public static void main(String args[]){
int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
x = sc.nextInt();
while(x!=0){
if(x%2==0){
	System.out.printf("even number");

}else{
System.out.printf("odd number");
}}}
}