package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {

		Vector xy=new Vector();  // Create the object for vector class
		
		xy.add("Vyankat");
		xy.add('V');
		xy.add(96);
		xy.add(95.5);

		System.out.println(xy);
		
		// for loop
		System.out.println("output of for loop ");
		
		for(int i=0; i<=xy.size()-1; i++)
		{
			System.out.println(xy.get(i));
		}
		
		// For each
		System.out.println("output of for each ");
		
		for(Object vs:xy)
		{
			System.out.println(vs);
		}
		
		
		// Iterator
		System.out.println("output of for Iterator");
		
		Iterator abc = xy.iterator();
		
		while(abc.hasNext())
		{
			System.out.println(abc.next());
		}
		
		
		// ListIterator
		System.out.println("output of for ListIterator");
		
		ListIterator mno = xy.listIterator();
		
		while(mno.hasNext())
		{
			System.out.println(mno.next());
		}
		
		
		//  Enumration    // support only legecy---> Vector class
		
		System.out.println("output of for enumration");
		
    	Enumeration klm = xy.elements();
		
		while(klm.hasMoreElements())
		{
			System.out.println(klm.nextElement());
		}
		
		
		
		
		
		
		
	}

}
