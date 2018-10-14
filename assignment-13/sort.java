import java.util.*;

import java.util.ArrayList;
import java.util.Collection;

class sort{
	public static void main(String[] args){
		ArrayList<Character> a1=new ArrayList<Character>();
		a1.add('b');
		a1.add('d');
		a1.add('z');
		a1.add('x');
		Collections.sort(a1);
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(5);
		a2.add(1);
		a2.add(9);
		a2.add(3);
		Collections.sort(a2);
		System.out.println(a2);


	}
}
