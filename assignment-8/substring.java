import java.util.Scanner;
public class substring{
	public static void SubString(String a, int l)
	{
	for (int i = 0; i < l; i++) 
		for (int j = i+1; j <= l; j++)
			
	System.out.println(a.substring(i, j));
	}

	public static void main(String[] args)
	{
		String a;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		a=s.nextLine();
		SubString(a, a.length());
	}
}
