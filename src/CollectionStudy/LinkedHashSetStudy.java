package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("vks");
		lhs.add("vynkt");
		lhs.add(123);
		lhs.add(12.23);
		lhs.add(null);
		lhs.add(12.23);
		lhs.add(null);
		lhs.add(true);
		
		System.out.println(lhs);
		
		// Iterator
		
		Iterator vs = lhs.iterator();
		
		while(vs.hasNext())
		{
			System.out.println(vs.next());
		}
		
		// For each
		
		for(Object fe:lhs)
		{
			System.out.println(fe);
		}
		
		
		
		
		
		

	}

}
