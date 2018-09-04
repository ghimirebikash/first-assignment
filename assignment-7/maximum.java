import java.util.Scanner;
class maximum{
public static void main(String[] args){
	String a;
	String b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string");
	a = sc.nextLine();
	System.out.println("enter the second string");
	b = sc.nextLine();
	int x = Integer.parseInt(a);
	int y=Integer.parseInt(b);
if(x>y){
	System.out.println("the maximum number is =" + x);
}else{
	System.out.println("the maximum number is =" + y);
}
	//System.out.println(x);
	//System.out.println(y);
}}