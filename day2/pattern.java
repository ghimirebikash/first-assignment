import java.util.Scanner;
class pattern{

public static void main(String args[]){
int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
x = sc.nextInt();
for(int i=1;i<=x;i++){
for(int j=1;j<=i;j++){
System.out.printf("*");}
System.out.printf("\n");
}
}}