import java.util.Scanner;
class find{
	public static void main(String[] args){
		int a;
		int x=0;
		int b;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		a=s.nextInt();
		System.out.println("enter the number to find");
		b=s.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the elements of an array");
		for(int i=0;i<a;i++){
			arr[i]=s.nextInt();
		}
		c=find1(arr,a-1,x,b,c);
		print(c);
	}




	public static int find1(int arr[],int size,int start,int find,int o){
	if(start>size){
		
		return -1;
		}
	
	else{
		if(arr[start]==find){
			
			return start;
		}
		else{
			return find1(arr,size,start+1,find,o);
			
		
		}

		
		}
		//print(o);

		}




public static void print(int x){
if(x!=-1){
	System.out.println("true");
}
	else if(x==-1){
		System.out.println("false");
	}

}}