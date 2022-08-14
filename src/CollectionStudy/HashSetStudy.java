package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		// 1.Doesn't allow duplicate values  2.Allow only 1 null value.  
		// 3.order of insertion-random insertion  4.no default capacity
		
		hs.add("vs");
		hs.add(true);
		hs.add(123);
		hs.add(12.34);
		hs.add(111);
		hs.add(null);
		hs.add(96);
		hs.add(null);
		hs.add("vs");
		hs.add("vks");
		
		System.out.println(hs);
		System.out.println(hs.size());
	//	System.out.println(hs.get());   we can't use get method in set interface B'cause of not order of insertion-random insertion
		
		System.out.println(hs.contains("vs"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(123));
		System.out.println(hs);
		
		// For Loop --->  We can not able to use for loop in set Interface
		// ListIterator --->  only for list interface type impl classes
		
		
		// For each
		System.out.println("=====For Loop=====");
		
		for(Object HAS:hs)
		{
			System.out.println(HAS);
		}
		
		// Iterator
		System.out.println("=====Iterator=====");
		
		Iterator abc = hs.iterator();
		
		while(abc.hasNext())
		{
			System.out.println(abc.next());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
