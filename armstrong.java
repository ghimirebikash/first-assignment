class armstrong{  
  public static void main(String[] args)  {  
 int b=0,a,temp;  
  int n=153;
temp=n;  
 while(n>0)  
    {  
    a=n%10;  
  n=n/10;  
    b=b+(a*a*a);  
    }  
    if(temp==b)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  