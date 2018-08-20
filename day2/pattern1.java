import java.util.Scanner;
class pattern1{

public static void main(String args[]){
int x;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
x = sc.nextInt();
for(int i=1;i<=x;i++){
System.out.printf("*");}
System.out.printf("\n");
for(int k=1;k<x;k++){
for(int j=1;j<=x;j++){
if(j!=1 && j!=x){
System.out.printf(" ");}
else{
System.out.printf("*");
}}
System.out.printf("\n");
}
for(int i=1;i<=x;i++){
System.out.printf("*");}}
}