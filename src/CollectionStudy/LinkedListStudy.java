package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		
		li.add("Vynkt");
        li.add('M');
        li.add(true);
        li.add(123);
        li.add(12.345);
        li.add(null);
        li.add("Pune");
        li.add(null);
        li.add(123);
        
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.get(5));
        System.out.println(li.contains(123));
        System.out.println(li.lastIndexOf(123));
        System.out.println(li.indexOf("Pune"));
        System.out.println(li.isEmpty());
        System.out.println(li.remove(3));
        
        System.out.println(li);
        
        li.add(6, "Raju");
        System.out.println(li);
        
        System.out.println(li.removeFirst());
        System.out.println(li);
        
        System.out.println(li.peek()); // Retrieves, but does not remove, the head (first element) of this list.
        
        System.out.println(li.peekFirst());  // Retrieves, but does not remove, the first element of this list,or returns null if this list is empty.
        
        System.out.println(li.peekLast());  // Retrieves, but does not remove, the last element of this list,or returns null if this list is empty.
        
        System.out.println(li.poll());  // Retrieves and removes the head (first element) of this list.
        System.out.println(li);
        
        System.out.println(li.pollFirst());  // Retrieves and removes the first element of this list,or returns null if this list is empty.
        
        System.out.println(li.pollLast());  // Retrieves and removes the last element of this list,or returns null if this list is empty.
        
        
        // for loop
        System.out.println("=====For Loop=====");
        
        for(int i=0; i<=li.size()-1; i++)
        {
        	System.out.println(li.get(i));
        }
        
        // For Each
        System.out.println("=====For Each=====");
        for(Object LL:li)
        {
        	System.out.println(LL);
        }
        
        // Iterator
        System.out.println("=====Iterator=====");
        
        Iterator it = li.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        // ListIterator
        System.out.println("=====ListIterator=====");
        
        ListIterator lit = li.listIterator();
        
        while(lit.hasNext())
        {
        	System.out.println(lit.next());
        }
        
    //  Enumration    // support only legecy---> Vector class
        
	}

}
