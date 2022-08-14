package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStd {

	public static void main(String[] args) {
		
		ArrayList vs=new ArrayList();   // If I declared like that then I can declared any data type and
		                                // Create the object for ArrayList Class
		
		vs.add("Vyanakt");
		vs.add("Somvanshi");
		vs.add(96);
		vs.add(65.5);
		vs.add('M');
		vs.add(null);
		vs.add(100);
		
		System.out.println(vs);
		
		System.out.println(vs.size());
		System.out.println(vs.get(3));
		System.out.println(vs.indexOf(100));
		System.out.println(vs.indexOf(null));
		System.out.println(vs.contains("Somvanshi"));
		System.out.println(vs.remove(0));  // Element remove on basis on index
		
		System.out.println(vs);
		
        System.out.println(vs.remove(65.5));  // Elements remove on basis on arguments
		System.out.println(vs);
		
		vs.add(3, "Vyankii");  // Element add in between --> when you are inserting element in between arraylists
		// vs.add("vyn");    // If I'm inserting elements with this type then that element should add at last of arraylist
		System.out.println(vs);
		
		System.out.println("=========");
		System.out.println(vs.get(0));
		System.out.println(vs.get(1));
		System.out.println(vs.get(2));
		System.out.println(vs.get(3));
		System.out.println(vs.get(4));
		System.out.println(vs.get(5));
		
		System.out.println("========");
		
		// for loop
		for(int i=0; i<=5; i++)   // printing element using for loop (static or hard coding)
		{
			System.out.println(vs.get(i));
		}
		
		
		System.out.println("===========");
		
		for(int j=0; j<=vs.size()-1; j++)   //printing element using for loop(dynamic coding)
		{
			System.out.println(vs.get(j));
		}
		
		// for each loop
		System.out.println("============");
		for(Object c:vs)   // any variable name.object
		{
			System.out.println(c);
		}
		
		System.out.println("============");
		
		
		// for Iterator
		Iterator al = vs.iterator();
		while(al.hasNext())
		{
			System.out.println(al.next());
		}
		System.out.println("======vv======");
		
		// for ListIterator
		
		ListIterator vsk = vs.listIterator();
		while(vsk.hasNext())
		{
			System.out.println(vsk.next());
		}

		

		
		
		
		
		

	}

}
