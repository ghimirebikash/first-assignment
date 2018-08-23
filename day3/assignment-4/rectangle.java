class rectangle{  
 int length;  
 int width;  
 void calculatearea (int l, int w){  
  length=l;  
  width=w;  
  System.out.println(length*width);
 }  
  public static void main(String args[]){  
  rectangle r1=new rectangle();  
 
  r1.calculatearea(11,5);  
 
   
}  
}