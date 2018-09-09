import java.util.Scanner;
class reverse{
	public static void main(String[] arga){
		String a;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string to  reverse");
		a=s.nextLine();
		StringBuffer x=new StringBuffer(a);
		x.reverse();
		System.out.println(x);

	}
}