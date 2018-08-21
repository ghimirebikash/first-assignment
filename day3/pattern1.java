import java.util.Scanner;
class pattern1{

public static void main(String args[]){
int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
x = sc.nextInt();
for(int i=1;i<=x;i++){
for(int j=i;j<=x;j++){
System.out.printf("*");
}

System.out.printf("\n");
}
}}