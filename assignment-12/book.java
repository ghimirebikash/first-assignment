 
import java.util.HashSet;
 import java.util.*;
public class book{
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("bikash");
        hs.add("sabin");
        hs.add("udit");
        hs.add("sunil");
        hs.add("rahul");
        System.out.println(hs);
        HashSet<String> sub = new HashSet<String>();
        sub.add("udit");
        sub.add("sabin");
        sub.add("sunil");
        sub.add("ajay");
        hs.retainAll(sub);
        System.out.println(hs);
    }
}
