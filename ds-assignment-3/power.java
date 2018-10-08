import java.util.Scanner;
class power{
public static void main(String[] args){
	int a;
	int b;
	int c=1;
	int d=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first number ");
	a=s.nextInt();
	System.out.println("enter the second number ");
	b=s.nextInt();
	d=calculate(a,b,c,d);
print(d);
}
public static int calculate(int num,int power,int initial,int result){
	if(initial>power){
		return result;

	}
	else{

	return calculate(num,power,initial+1,result*num);

	}
}
public static void print(int g){
	System.out.println(g);
	
}	
}