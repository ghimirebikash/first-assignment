import java.util.Scanner;
class fibonacci{
	public static void main(String[]args){
		int a;
		int d=0;
		int b=0;
		int c=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number for fibonacci");

		a=s.nextInt();
		if(a<=0){
		}
		else if(a==1){
	    System.out.println(b);
		}
		else{ System.out.println(b);
		      System.out.println(c);
		       calculate(a,b,c,d);
		  }
	  
		
		}

	
	public static void print(int z){
		System.out.println(z);
	
	}
	public static void calculate(int u,int v,int w,int x){
    

		if(x>=u){
			return ;
		}
			else{
        
       
       x=v+w;
       print(x);
          calculate(u,w,x,w+v);

			}
		
	}
}