import java.util.*;
public class toggle
{

    public static void main(String[] args)
    {
        System.out.println("Enter in a sentence:"); 
        Scanner s = new Scanner(System.in); 
        String a = s.nextLine();


       //System.out.println("All uppercase:" + a.toUpperCase());
       //System.out.println("All lowercase:" + a.toLowerCase()); 
        System.out.println("Converted String:" + toggleString(a)); 
        s.close(); 
     }

    public static String toggleString(String a)
    {
       String toggled = ""; 
       for(int i=0; i<a.length(); i++)
       
       {


           char letter = a.charAt(i); 
	if (letter!=' '){
           if(Character.isUpperCase(a.charAt(i)))
           {
                letter = Character.toLowerCase(letter); 
                toggled = toggled + letter; 

           }
           else if(Character.isLowerCase(a.charAt(i)))
           {
               letter = Character.toUpperCase(letter);
               toggled = toggled + letter; 
           }

       }else{
       	toggled = toggled + letter; 
       }

   }
       return toggled; 

   }}