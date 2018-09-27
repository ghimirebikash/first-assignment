import java.util.*;  
public class key{  
  public static void main(String args[]) {  
  HashMap<Integer,String> map= new HashMap<Integer,String>();  
  map.put(1, "bikash");
  map.put(2, "udit");
  map.put(3, "sabin");
  map.put(4, "ayush");
  map.put(5, "dj");
  for(Map.Entry x:map.entrySet()){  
   System.out.println(x.getKey()+" "+x.getValue());  
  } 
   }
 }