import java.util.Scanner;
class sum{
	public static void main(String[] args){
		String a;
        int y=0;
        int ans=0;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		
		int x=a.length();
		int arr[]=new int[x];
		ans=calculate(arr,a,x,y,ans);
		print(ans);
	}
	public static int calculate(int arr[],String a,int len,int initial,int f){
		
		if(initial>len-1){
			return f;
		}
		else{
			
arr[initial]=a.charAt(initial);
if((arr[initial]>='0') && (arr[initial]<='9')){
f=f+(arr[initial]-'0');}


return calculate(arr,a,len,initial+1,f);
		}

	}
	public static void print(int ans){
		System.out.println(ans);

	}
}