import java.util.Scanner;
class check{
public static void main(String[] args){
	String a;
	int b;
	int initial=0;
	int j=0;
	Scanner s=new Scanner(System.in);
	a=s.nextLine();
	b=a.length();
	char arr[]=new char[b];
	j=calculate(arr,a,initial,b,j);
	print(j);
}
public static int calculate(char arr[],String a,int initial,int len,int k){
	if(initial>len-1){
		return k;
	}
		else if((a.charAt(initial)=='[')  || (a.charAt(initial)=='{') || (a.charAt(initial)=='(')){
		k++;
       return calculate(arr,a,initial+1,len,k+1);
}
else if((a.charAt(initial)==']')  || (a.charAt(initial)=='}') || (a.charAt(initial)==')')){
		return calculate(arr,a,initial+1,len,k-1);	
}
else{
	return calculate(arr,a,initial+1,len,k);

}
}



public static void print(int z){
	if(z==0){

	System.out.println("yes");
	
	}
	else
	{
		System.out.println("no");
	}}

}

