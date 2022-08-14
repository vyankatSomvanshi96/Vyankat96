package CollectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();   // note: we can store only homogeneous data
		
		ts.add("Vynkt");  // In Declaration It's behave like First declaration 
		ts.add("abs");
		ts.add("xyz");
		ts.add("Pune");
	//	ts.add(null);    ( Doesn't allow null value );--> will throw nullpointer exception
		ts.add("Goa");
		ts.add("DharaShiv");
		ts.add("Vynkt");
		
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains("Goa"));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.first());
		ts.add("Som");
		System.out.println(ts);		
		ts.add("VS");
		System.out.println(ts);
		System.out.println(ts.remove("VS"));
		System.out.println(ts);
		
		// For loop not support
		// ListIterator not support
		//We have only two options 1) For Each and 2) Iterator
		
		// For Each
		for(Object vs:ts)
		{
			System.out.println(vs);
		}
		
		
		// Iterator
		
		Iterator vks = ts.iterator();
		
		while(vks.hasNext())
		{
			System.out.println(vks.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
