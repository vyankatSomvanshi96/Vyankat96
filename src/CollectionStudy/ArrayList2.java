package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<>();  /// Create the object for ArrayList Class
		
		ar.add(91);
		ar.add(92);
		ar.add(93);
		ar.add(94);
		ar.add(95);
		ar.add(96);
		ar.add(97);
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		System.out.println(ar.contains(99));
		System.out.println(ar.indexOf(97));
		System.out.println(ar.remove(3));
		
		System.out.println(ar);
		
		ar.add(5, 100);
		System.out.println(ar);
		
		System.out.println(ar.get(6));
		
		System.out.println("==========");
		
		// for loop
		
		System.out.println("===================");
		System.out.println("output of for loop");
		
		for(int i=0; i<=ar.size()-1;i++)   //printing element using for loop(dynamic coding)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("===================");
		
		// For each
		
		System.out.println("output of for each loop");
		
		for(Integer vks:ar)   // any variableName:objectName
		{
			System.out.println(vks);
		}
		
		System.out.println("===================");
		
		// Iterator 
		
		System.out.println("output of for Iteratoe");
		Iterator<Integer> xyz = ar.iterator();
		while(xyz.hasNext())
		{
			System.out.println(xyz.next());
		}
		System.out.println("===================");
		
		// ListIterator
		
		System.out.println("output of for ListIteratoe");
		ListIterator<Integer> LI = ar.listIterator();
		
		while(LI.hasNext())
		{
			System.out.println(LI.next());
		}
		
		// Example 2nd
		
		ArrayList<String> vks=new ArrayList<>();
		
		vks.add("vynk");
		vks.add("somv");
	//	vks.add(123)     We can able to declared only String data type because of we declared arraylist as String only
		
		
		
		

	}

}
