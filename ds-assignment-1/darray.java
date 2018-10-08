import java.util.Scanner;
class darray{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int arr[][]=new int[a][b];
for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
		arr[i][j]=s.nextInt();
	}
	System.out.println();
}
	for(int i=0;i<a;i++){
		if(i%2==0){
		for(int j=0;j<b;j++){
			
System.out.println(arr[i][j]);
	}}
else{
	for(int j=b-1;j>=0;j--){
	System.out.println(arr[i][j]);
}}

}
}}