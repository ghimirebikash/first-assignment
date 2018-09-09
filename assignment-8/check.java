import java.util.Scanner;
class check{
	public static void main(String[] args){
		String a;
		String b;
		int c=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		a=sc.nextLine();
		System.out.println("enter the second string");
		b=sc.nextLine();
		int flag=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==b.charAt(0)){
				int j=0;
				while( i<a.length() && j<b.length() &&  a.charAt(i)==b.charAt(j)){
						j++;i++;
				}
				if(j==b.length()){
					flag=1;
					break;
				}
				else

				{
					i--;
				}
			}
		
}
if(flag==1)	{	
		System.out.println("TRUE");
}
else{
			System.out.println("false");


}
		}
	}


